package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.ejb.sessionbean.dto.VertragDTO;
import com.quest.apm.testjavaee.ejb.sessionbean.dto.VertragEntityDTO;
import com.quest.apm.testjavaee.ejb.sessionbean.dto.VertragEntityDTOHome;
import com.quest.apm.testjavaee.ejb.sessionbean.dto.VertragEntityDTOLocal;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.Date;

/**
 * Servlet implementation class InvokeLocalHelloBeanWithAnnotation
 */
@WebServlet("/InvokeVertragEnityDTOWithAnnotation")
public class InvokeVertragEnityDTOWithAnnotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private VertragEntityDTOHome dtoLocalHome;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvokeVertragEnityDTOWithAnnotation() {
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
			StringBuilder sb = new StringBuilder();
			VertragEntityDTOLocal dtoLocal = dtoLocalHome.create();
			String s0 = dtoLocal.getContent();
			sb.append("VertragEntityDTOLocal content:" + s0 + "<br/>");

			VertragDTO vertragDTO = new VertragDTO();

			VertragEntityDTO vertragEntityDTO = new VertragEntityDTO(vertragDTO);
			sb.append("vertragEntityDTO content:" + vertragEntityDTO.getContent() + "<br/>");

			Class a = VertragEntityDTO.class;
			Constructor constructor = a.getConstructor(VertragDTO.class);
			VertragEntityDTO reflectVertragEntityDTO = (VertragEntityDTO) constructor.newInstance(vertragDTO);
			sb.append("reflectVertragEntityDTO content:" + reflectVertragEntityDTO.getContent() + "<br/>");
			/*
			ClassPool cp = ClassPool.getDefault();
			CtClass ctClass = cp.get("Test1");
			CtMethod m = ctClass.getDeclaredMethod("run");
			m.addParameter(CtClass.intType);

			ctClass.toClass();
			*/

			output(sb.toString(), request, response);

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException("Exception happens:" + e.getMessage(), e);
		}
	}

	private void output(String s, HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StringBuilder sb = new StringBuilder();
		sb.append("Current Time:" + new Date() + "<br/>");
		sb.append("Successfully invoke the \"Stateful Session Bean\": VertragEntityDTOLocal<br>");
		out.println(sb.toString());
		out.println(s);
	}

}
