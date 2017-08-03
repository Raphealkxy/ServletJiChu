package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 分别从AServlet 转发 和重定向 给 BServlet
 * 
 * @author seawind
 * 
 */
public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("AServlet 执行...");
		// // 转发
		// ServletContext context = getServletContext();
		//
		// // 转发给BServlet 这里 / 当前web 工程 /day05
		// RequestDispatcher dispatcher = context.getRequestDispatcher("/b");
		//
		// dispatcher.forward(request, response);

		// 重定向 / 代表当前web服务器
		response.setStatus(302);
		response.setHeader("Location", "/day05/b"); // 从客户端访问，必须含有工程路径
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
