package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.ejb.ejb3.sessionbean.TestStatelessSessionBeanLocal;
import com.quest.apm.testjavaee.ejb.ejb3.sessionbean.TestStatelessSessionBeanRemote;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InvokeTestStatelessSessionBean
 */
@WebServlet(urlPatterns = "/InvokeTestStatelessSessionBean", asyncSupported = true)
public class InvokeTestStatelessSessionBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB
	TestStatelessSessionBeanLocal testStatelessSessionBeanLocal;

	@EJB
	TestStatelessSessionBeanRemote testStatelessSessionBeanRemote;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvokeTestStatelessSessionBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.invokeEmbeddedStateless(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.invokeEmbeddedStateless(request, response);
	}

	private void invokeEmbeddedStateless(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String type = request.getParameter("type");

		String result = "test";
		if ("local".equalsIgnoreCase(type)) {
			result = testStatelessSessionBeanLocal.getStr(result);
		} else {
			result = testStatelessSessionBeanRemote.getStr(result);
		}

		PrintWriter out = response.getWriter();
		try {
			out.println("Invoked TestStatelessSessionBean " +" Successfully, getStr: " +result+"<br><br>");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			out.println("Failed to invoke Stateless Session Bean<br>");
			out.println("<br>"+ e.toString()+"<br>");
			e.printStackTrace(out);
		}
	}
}
