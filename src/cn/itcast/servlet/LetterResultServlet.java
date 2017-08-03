package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ʾ��ĸͳ�ƽ��
 * 
 * @author seawind
 * 
 */
public class LetterResultServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1 ��ServletContext �������
		ServletContext context = getServletContext();
		int[] times = (int[]) context.getAttribute("times");

		// 2���������ӡ�����
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		for (int i = 0; i < times.length; i++) {
			// ��ĸ
			char c = (char) ('A' + i);
			// ����
			int ltimes = times[i];

			out.println("��ĸ��" + c + "������ " + ltimes + "�Σ�<br/>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
