package com.quest.apm.testjavaee.web.servlet;

import com.quest.apm.testjavaee.util.ApacheHttpClientUtil;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

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
@WebServlet(urlPatterns = "/InvokeApacheHttpClient2")
public class InvokeApacheHttpClient2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InvokeApacheHttpClient2() {
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

	public void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StringBuilder sb = new StringBuilder();
		String url = "http://apache.org/";
		String result1 = excuteGetHttp(url);
		sb.append("######################/InvokeApacheHttpClient: result1:" + result1 + "<br/>.");
		output(sb.toString(), response);
	}


	public static String excuteGetHttp(String url) throws IOException {
        HttpClient client = new HttpClient();
        GetMethod getMethod = new GetMethod(url);
        client.getParams().setContentCharset("UTF-8");
        client.executeMethod(getMethod);
        String result = getMethod.getResponseBodyAsString();

        return result;
    }

	private void output(String output, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println(output);
		out.println(output);
	}

}
