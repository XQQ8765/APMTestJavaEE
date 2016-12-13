package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.ejb.jpa.entity.Book;
import com.quest.apm.testjavaee.ejb.sessionbean.HelloBean;
import com.quest.apm.testjavaee.ejb.sessionbean.HelloLocal;
import com.quest.apm.testjavaee.ejb.sessionbean.HelloLocalHome;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class InvokeLocalHelloBean
 */
@WebServlet("/InvokeLocalHelloBean")
public class InvokeLocalHelloBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvokeLocalHelloBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
			InitialContext ic = new InitialContext();
			String beanJndiName = request.getParameter("beanJndiName");
			//"java:comp/ear/HelloBean/local";
			//"java:comp/env/ejb/HelloBean"
			//"ejb/HelloBean"
			//"http://10.154.10.35:9080/war/InvokeLocalHelloBean?beanJndiName=java:comp/env/com.quest.apm.testjavaee.web.servlet.InvokeLocalHelloBeanWithAnnotation/helloBean"
			//http://10.154.10.35:9080/war/InvokeLocalHelloBean?beanJndiName=java:comp/env/com.quest.apm.testjavaee.web.servlet.InvokeLocalHelloBeanWithAnnotation/helloLocalHome
			HelloLocalHome hlh = (HelloLocalHome) ic.lookup(beanJndiName);


			// Step 5: Create the EJB local interface object.
			HelloLocal helloBean = (HelloLocal) hlh.create();
			String s = helloBean.helloWorld();
			outputBookList(s, beanJndiName, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException("Exception happens:" + e.getMessage(), e);
		}
	}

	private void outputBookList(String s, String beanjndiName, HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Successfully invoke the \"Stateful Session Bean\":<br>");
		out.println("Bean jndi name:" + beanjndiName + "<br/>");
		out.println(s);
	}

}
