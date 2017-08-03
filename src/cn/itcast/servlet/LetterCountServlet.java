package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �����ĸ���ִ���ͳ��
 * 
 * @author seawind
 * 
 */
public class LetterCountServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Letter count ...");
		// ����û��������Ӣ������
		String content = request.getParameter("content");
		content = content.toUpperCase(); // ������תΪ��д

		// ����ͳ�� --- ���Դ�Сд
		int[] times = new int[26];

		// ����ÿһ����ĸ
		for (int i = 0; i < content.length(); i++) {
			char c = content.charAt(i);
			// �ж���ĸ�ǲ���26����ĸ֮һ
			if (Character.isLetter(c)) { // c >= 'A' && c <= 'Z'
				// ��� c �� 'A' ������ 0 λ�� +1 ����� c�� 'B' ������1λ��+1
				times[c - 'A']++;
			}
		}

		// ������һ��Servlet��ʾ ����ͳ�ƽ������ServletContext
		ServletContext context = getServletContext();
		context.setAttribute("times", times);

		// ת����ת ��һ��Servlet
		RequestDispatcher dispatcher = context
				.getRequestDispatcher("/servlet/result");
		dispatcher.forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
