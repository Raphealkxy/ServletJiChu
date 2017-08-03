package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {
	// private ServletConfig config;

	// // ͨ��init ���� ��ʼ��
	// @Override
	// public void init(ServletConfig config) throws ServletException {
	// // ͨ��config���� ���Servlet��ʼ����Ϣ
	// // ���ָ��һ��name��value
	// System.out.println(config.getInitParameter("itcast"));
	// System.out.println(config.getInitParameter("address"));
	//
	// // �������name Ȼ�� ����name ���value
	// // Enumeration ���� Iterator ǰ��
	// Enumeration<String> names = config.getInitParameterNames();
	// while (names.hasMoreElements()) {
	// String name = names.nextElement();
	// // ͨ�� name ���value
	// System.out.println(name + ":" + config.getInitParameter(name));
	// }
	//
	// this.config = config;
	// }

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ���config ������ --- ��Ҫ��init������ ��config���� �����Ա����
		System.out.println(getServletConfig().getInitParameter("itcast"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
