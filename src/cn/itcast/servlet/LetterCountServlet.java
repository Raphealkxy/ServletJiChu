package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 完成字母出现次数统计
 * 
 * @author seawind
 * 
 */
public class LetterCountServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Letter count ...");
		// 获得用户输入这段英文内容
		String content = request.getParameter("content");
		content = content.toUpperCase(); // 将内容转为大写

		// 分析统计 --- 忽略大小写
		int[] times = new int[26];

		// 遍历每一个字母
		for (int i = 0; i < content.length(); i++) {
			char c = content.charAt(i);
			// 判断字母是不是26个字母之一
			if (Character.isLetter(c)) { // c >= 'A' && c <= 'Z'
				// 如果 c 是 'A' 在数组 0 位置 +1 ，如果 c是 'B' 在数组1位置+1
				times[c - 'A']++;
			}
		}

		// 交个下一个Servlet显示 ，将统计结果保存ServletContext
		ServletContext context = getServletContext();
		context.setAttribute("times", times);

		// 转发跳转 另一个Servlet
		RequestDispatcher dispatcher = context
				.getRequestDispatcher("/servlet/result");
		dispatcher.forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
