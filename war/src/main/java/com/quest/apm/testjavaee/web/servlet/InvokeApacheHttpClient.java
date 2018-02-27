package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.util.ApacheHttpClientUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * For case 4194316-1
 */
@WebServlet(urlPatterns = "/InvokeApacheHttpClient", loadOnStartup = 1)
public class InvokeApacheHttpClient extends HttpServlet {
	private static int ae = ApacheHttpClientUtil.excuteGetHttp2();
	private static final long serialVersionUID = 1L;
    public InvokeApacheHttpClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		ApacheHttpClientUtil.excuteGetHttp2();
		super.init();
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

	public void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StringBuilder sb = new StringBuilder();
		/*
		String result1 = excuteHttp();
		sb.append("######################/InvokeApacheHttpClient: result1:" + result1 + "<br/>.");
		*/
		int result2 = ApacheHttpClientUtil.excuteGetHttp2();
		sb.append("######################/InvokeApacheHttpClient: result2:" + result2 + "<br/>.");
		output(sb.toString(), response);
	}
/*
	public static String excuteHttp() throws IOException {
		final String url = "http://apache.org/";
		return ApacheHttpClientUtil.excuteGetHttp(url);
	}
*/
	private void output(String output, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println(output);
		out.println(output);
	}

}
