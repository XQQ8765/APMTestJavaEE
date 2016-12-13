package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.ejb.sessionbean.HelloLocal;
import com.quest.apm.testjavaee.ejb.sessionbean.HelloLocalHome;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InvokeLocalHelloBeanWithAnnotation
 */
@WebServlet("/InvokeLocalHelloBeanWithAnnotation")
public class InvokeLocalHelloBeanWithAnnotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//@EJB(name="ejb/HelloBean")
	@EJB
	private HelloLocalHome helloLocalHome;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvokeLocalHelloBeanWithAnnotation() {
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
			/*
			InitialContext ic = new InitialContext();
			//HelloLocalHome hlh = (HelloLocalHome) ic.lookup("java:comp/env/ejb/HelloBean");
			HelloLocalHome hlh = (HelloLocalHome) ic.lookup("ejb/HelloBean");


			// Step 5: Create the EJB local interface object.
			HelloLocal helloLocalHome = (HelloLocal) hlh.create();
			*/
			HelloLocal helloLocal = helloLocalHome.create();
			String s = helloLocal.helloWorld();
			outputBookList(s, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException("Exception happens:" + e.getMessage(), e);
		}
	}

	private void outputBookList(String s, HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Successfully invoke the \"Stateful Session Bean\":<br>");
		out.println(s);
	}

}
