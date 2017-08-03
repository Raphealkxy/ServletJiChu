package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户访问 countservlet 访问次数 +1
 * 
 * @author seawind
 * 
 */
public class CountServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// 向ServletContext 保存访问次数 0
		// 获得ServletContext对象
		ServletContext context = getServletContext();
		// 保存数据 setAttribute
		context.setAttribute("visittimes", 0);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 每次访问 执行 doGet --- 将visittimes 次数 +1

		// 1 从ServletContext中获得 访问次数
		ServletContext context = getServletContext();
		int times = (Integer) context.getAttribute("visittimes");

		// 2、访问次数 +1
		times++;

		// 3、将访问次数更新回去 ServletContext
		context.setAttribute("visittimes", times);

		System.out.println("网站被访问了一次！");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
