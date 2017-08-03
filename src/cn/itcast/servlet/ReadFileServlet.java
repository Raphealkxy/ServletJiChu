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
 * ͨ��Servlet ��ȡ �ļ�
 * 
 * @author seawind
 * 
 */
public class ReadFileServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ a1.txt ���� WEB-INF/classes
		String filename2 = "/WEB-INF/classes/a1.txt";
		filename2 = getServletContext().getRealPath(filename2);
		readfile(filename2);

		// ��ȡ a2.txt λ����վ��Ŀ¼
		String filename = "/a2.txt";
		// ͨ�� / ��ʼ·�� ��þ��Դ���·��
		// E:\apache-tomcat-6.0.14\webapps\day05\a2.txt
		filename = getServletContext().getRealPath(filename);
		System.out.println(filename);
		readfile(filename);

		// ��Ϊa1.txt λ�� /WEB-INF/classes --- ��·�� �� --- ͨ��Class�����ȡ�ļ�
		Class c = ReadFileServlet.class;
		// ��� / ����classpath ��Ŀ¼ --- /a1.txt �ȼ��� /WEB-INF/classes/a1.txt
		// ���ش��̾���·��
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
