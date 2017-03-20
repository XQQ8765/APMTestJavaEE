package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.Calculate;
import com.quest.apm.testjavaee.ejb.jpa.entity.Book;

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
 * Servlet implementation class InvokeCalculate
 */
@WebServlet("/InvokeCalculate")
public class InvokeCalculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InvokeCalculate() {
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
		int i = 3;
		int j = 2;
		Calculate calculate1 = new Calculate();
		int result1 = calculate1.calculate(i, j);

		Calculate calculate2 = new Calculate(false);
		int result2 = calculate2.calculate(i, j);
		StringBuilder sb = new StringBuilder();
		sb.append("######################InvokeCalculate: result1:" + result1 + "<br/>.");
		sb.append("######################InvokeCalculate:  result1:" + result2 + "<br/>.");
		output(sb.toString(), response);
	}

	private void output(String output, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println(output);
		out.println(output);
	}

}
