package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ͨ��Servlet�鿴 ��վ���ʴ���
 * 
 * @author seawind
 * 
 */
public class CountShowServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��� ��վ���ʴ���
		ServletContext context = getServletContext();

		int times = (Integer) context.getAttribute("visittimes");

		// ������ʴ��� �������
		response.getWriter().println(
				"web site has been visitted:" + times + " times!");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
