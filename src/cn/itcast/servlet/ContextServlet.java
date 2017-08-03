package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����ȫ�ֳ�ʼ������
 * 
 * @author seawind
 * 
 */
public class ContextServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��� hobby ȫ�ֲ���
		// ͨ��ServletConfig ��� ServletContext
		// ServletContext context = getServletConfig().getServletContext();

		// ����д�����Լ�һ��
		ServletContext context = getServletContext();

		// ��ȡȫ�ֳ�ʼ������
		System.out.println(context.getInitParameter("hobby"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
