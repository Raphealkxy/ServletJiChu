package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	// 覆盖 doGet 和 doPost
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 处理 get方式请求
		System.out.println("get 请求 ...");

		// 设置响应流 编码问题
		resp.setContentType("text/html;charset=utf-8");

		// 生成 hello.html 相同内容
		PrintWriter out = resp.getWriter(); // 获得向浏览器输出流
		// 通过 out 流 生成 html
		out.println("<html>");
		out.println("<head>");
		out
				.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>Hello,这是一个 由Servlet 动态生成网页！</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 处理 post方式请求
		System.out.println("post 请求 ...");
	}
}
