package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.ejb.ejb2.entitybean.BookRemote;
import com.quest.apm.testjavaee.ejb.ejb2.entitybean.BookRemoteHome;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class InvokeBookForEJB2EntityBean
 */
@WebServlet("/InvokeBookForEJB2EntityBean")
public class InvokeBookForEJB2EntityBean extends HttpServlet {
	@EJB
	private BookRemoteHome bookRemoteHome;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvokeBookForEJB2EntityBean() {
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

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO, modify
		try {
			InitialContext ic = new InitialContext();
			BookRemote bookRemote = bookRemoteHome.findByPrimaryKey(1);

			List<BookRemote> bookList = new ArrayList<BookRemote>();
			bookList.add(bookRemote);

			outputBookList(bookList, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException("Exception happens:" + e.getMessage(), e);
		}
	}

	private void outputBookList(List<BookRemote> bookList, HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Successfully get Book list:<br>");

		if (bookList == null || bookList.size() == 0) {
			out.println("Book list is empty.");
		} else {
			for (int i =0; i< bookList.size(); ++i) {
				BookRemote book = bookList.get(i);
				out.println("Book[" + i + "]: id:" + book.getId() + ", name:" + book.getName() + "<br/>");
			}
		}
	}

}
