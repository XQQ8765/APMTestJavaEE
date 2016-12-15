package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.ejb.ejb2.BookEJB2Bean;
import com.quest.apm.testjavaee.ejb.ejb2.BookLocalHome;
import com.quest.apm.testjavaee.ejb.jpa.entity.Book;

import javax.ejb.FinderException;
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
 * Servlet implementation class InvokeBookForEJB2EntityBean
 */
@WebServlet("/InvokeBookForEJB2EntityBean")
public class InvokeBookForEJB2EntityBean extends HttpServlet {
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
			BookLocalHome bookLocalHome = (BookLocalHome) ic.lookup("java:comp/env/ejb/BookEJB2Bean");

			List<BookEJB2Bean> bookList = null;
			//List<BookEJB2Bean> bookList = (List<BookEJB2Bean>) bookLocalHome.findAll();
			outputBookList(bookList, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException("Exception happens:" + e.getMessage(), e);
		}
	}

	private void outputBookList(List<BookEJB2Bean> bookList, HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Successfully get Book list:<br>");

		if (bookList == null || bookList.size() == 0) {
			out.println("Book list is empty.");
		} else {
			for (int i =0; i< bookList.size(); ++i) {
				BookEJB2Bean book = bookList.get(i);
				out.println("Book[" + i + "]: id:" + book.getId() + ", name:" + book.getName() + "<br/>");
			}
		}
	}

}
