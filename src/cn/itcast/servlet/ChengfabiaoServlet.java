package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 打印 指定数字乘法表
 * 
 * @author seawind
 * 
 */
public class ChengfabiaoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得请求提交数据 number
		String numberStr = request.getParameter("number"); // 通过 input name 获得数据
		int number = 0;
		try {
			number = Integer.parseInt(numberStr);
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			throw new RuntimeException("输入的不是整数");
		}

		// 打印 九九 ---输出到浏览器
		PrintWriter out = response.getWriter();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				out.print(j + "*" + i + "=" + j * i + " ");
			}
			out.println("<br/>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
