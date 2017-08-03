package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 访问全局初始化参数
 * 
 * @author seawind
 * 
 */
public class ContextServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得 hobby 全局参数
		// 通过ServletConfig 获得 ServletContext
		// ServletContext context = getServletConfig().getServletContext();

		// 上面写法可以简化一下
		ServletContext context = getServletContext();

		// 读取全局初始化参数
		System.out.println(context.getInitParameter("hobby"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
