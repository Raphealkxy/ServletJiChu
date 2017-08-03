package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �ֱ��AServlet ת�� ���ض��� �� BServlet
 * 
 * @author seawind
 * 
 */
public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("AServlet ִ��...");
		// // ת��
		// ServletContext context = getServletContext();
		//
		// // ת����BServlet ���� / ��ǰweb ���� /day05
		// RequestDispatcher dispatcher = context.getRequestDispatcher("/b");
		//
		// dispatcher.forward(request, response);

		// �ض��� / ����ǰweb������
		response.setStatus(302);
		response.setHeader("Location", "/day05/b"); // �ӿͻ��˷��ʣ����뺬�й���·��
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
