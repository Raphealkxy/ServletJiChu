package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 通过修改模板后，创建简洁 Servlet
public class HelloServlet3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		for (int i = 1; i <= 10; i++) {
			response.getWriter().println(i + "<br/>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// for (int i = 1; i <= 10; i++) {
		// response.getWriter().println(i + "<br/>");
		// }
		// 当doPost 和 doGet 代码逻辑完全相同 --- 为了简化编程 互相调用
		doGet(request, response);
	}

}
