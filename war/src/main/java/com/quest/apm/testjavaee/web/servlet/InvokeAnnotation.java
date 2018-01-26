package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.AnnotationHello;
import com.quest.apm.testjavaee.Calculate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * For testing issue https://jira.labs.quest.com/browse/FAPM-2280
 * Servlet implementation class InvokeCalculate
 */
@WebServlet("/InvokeAnnotation")
public class InvokeAnnotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InvokeAnnotation() {
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

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		AnnotationHello iaObj = new AnnotationHello();
		String result = iaObj.hello();
		StringBuilder sb = new StringBuilder();
		sb.append("######################/InvokeAnnotation: result:" + result + "<br/>.");
		output(sb.toString(), response);
	}

	private void output(String output, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println(output);
		out.println(output);
	}

}
