package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过Servlet查看 网站访问次数
 * 
 * @author seawind
 * 
 */
public class CountShowServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得 网站访问次数
		ServletContext context = getServletContext();

		int times = (Integer) context.getAttribute("visittimes");

		// 输出访问次数 到浏览器
		response.getWriter().println(
				"web site has been visitted:" + times + " times!");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
