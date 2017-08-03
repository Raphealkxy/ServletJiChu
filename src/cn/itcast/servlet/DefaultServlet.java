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
 * ·�� / ����һ��ȱʡServlet
 * 
 * @author seawind
 * 
 */
public class DefaultServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ȱʡServletִ����");

		// ���û�������Դ����
		// 1������û�����Ŀ����Դ·��
		String path = request.getRequestURI().substring(
				request.getContextPath().length());
		System.out.println(path);

		// 2.�ж��ļ��Ƿ���� --- ��ȡ������Դ���·��
		String filename = getServletContext().getRealPath(path);
		File file = new File(filename); // �þ���·�� �����ļ�����
		if (file.exists()) {
			// ����
			InputStream in = new FileInputStream(file);
			OutputStream out = response.getOutputStream();
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			in.close();
			out.close();
		} else {
			// ������
			response.setStatus(404);
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
