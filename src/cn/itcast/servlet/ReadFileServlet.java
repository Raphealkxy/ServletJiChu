package cn.itcast.servlet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过Servlet 读取 文件
 * 
 * @author seawind
 * 
 */
public class ReadFileServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 读取 a1.txt 出现 WEB-INF/classes
		String filename2 = "/WEB-INF/classes/a1.txt";
		filename2 = getServletContext().getRealPath(filename2);
		readfile(filename2);

		// 读取 a2.txt 位于网站根目录
		String filename = "/a2.txt";
		// 通过 / 开始路径 获得绝对磁盘路径
		// E:\apache-tomcat-6.0.14\webapps\day05\a2.txt
		filename = getServletContext().getRealPath(filename);
		System.out.println(filename);
		readfile(filename);

		// 因为a1.txt 位于 /WEB-INF/classes --- 类路径 中 --- 通过Class对象读取文件
		Class c = ReadFileServlet.class;
		// 语句 / 代表classpath 根目录 --- /a1.txt 等价于 /WEB-INF/classes/a1.txt
		// 返回磁盘绝对路径
		String filename3 = c.getResource("/a1.txt").getFile();
		System.out.println(filename3);
		readfile(filename3);
	}

	public static void readfile(String filename) throws FileNotFoundException,
			IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
		in.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
