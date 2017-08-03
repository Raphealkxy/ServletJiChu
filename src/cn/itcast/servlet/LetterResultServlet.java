package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 显示字母统计结果
 * 
 * @author seawind
 * 
 */
public class LetterResultServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1 从ServletContext 获得数据
		ServletContext context = getServletContext();
		int[] times = (int[]) context.getAttribute("times");

		// 2、将结果打印浏览器
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		for (int i = 0; i < times.length; i++) {
			// 字母
			char c = (char) ('A' + i);
			// 次数
			int ltimes = times[i];

			out.println("字母：" + c + "出现了 " + ltimes + "次！<br/>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
