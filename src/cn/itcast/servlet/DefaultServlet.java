package cn.itcast.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 路径 / 这是一个缺省Servlet
 * 
 * @author seawind
 * 
 */
public class DefaultServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("缺省Servlet执行了");

		// 将用户访问资源返回
		// 1、获得用户访问目标资源路径
		String path = request.getRequestURI().substring(
				request.getContextPath().length());
		System.out.println(path);

		// 2.判断文件是否存在 --- 读取必须绝对磁盘路径
		String filename = getServletContext().getRealPath(path);
		File file = new File(filename); // 用绝对路径 构造文件对象
		if (file.exists()) {
			// 存在
			InputStream in = new FileInputStream(file);
			OutputStream out = response.getOutputStream();
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			in.close();
			out.close();
		} else {
			// 不存在
			response.setStatus(404);
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
