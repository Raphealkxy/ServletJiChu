package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	// ���� doGet �� doPost
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// ���� get��ʽ����
		System.out.println("get ���� ...");

		// ������Ӧ�� ��������
		resp.setContentType("text/html;charset=utf-8");

		// ���� hello.html ��ͬ����
		PrintWriter out = resp.getWriter(); // ���������������
		// ͨ�� out �� ���� html
		out.println("<html>");
		out.println("<head>");
		out
				.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>Hello,����һ�� ��Servlet ��̬������ҳ��</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// ���� post��ʽ����
		System.out.println("post ���� ...");
	}
}
