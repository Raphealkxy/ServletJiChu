package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {
	// private ServletConfig config;

	// // 通过init 方法 初始化
	// @Override
	// public void init(ServletConfig config) throws ServletException {
	// // 通过config参数 获得Servlet初始化信息
	// // 获得指定一个name的value
	// System.out.println(config.getInitParameter("itcast"));
	// System.out.println(config.getInitParameter("address"));
	//
	// // 获得所有name 然后 根据name 获得value
	// // Enumeration 就是 Iterator 前身
	// Enumeration<String> names = config.getInitParameterNames();
	// while (names.hasMoreElements()) {
	// String name = names.nextElement();
	// // 通过 name 获得value
	// System.out.println(name + ":" + config.getInitParameter(name));
	// }
	//
	// this.config = config;
	// }

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得config 中数据 --- 需要在init方法中 将config对象 保存成员变量
		System.out.println(getServletConfig().getInitParameter("itcast"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
