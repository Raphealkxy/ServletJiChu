package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ͨ���޸�ģ��󣬴������ Servlet
public class HelloServlet3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		for (int i = 1; i <= 10; i++) {
			response.getWriter().println(i + "<br/>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// for (int i = 1; i <= 10; i++) {
		// response.getWriter().println(i + "<br/>");
		// }
		// ��doPost �� doGet �����߼���ȫ��ͬ --- Ϊ�˼򻯱�� �������
		doGet(request, response);
	}

}
