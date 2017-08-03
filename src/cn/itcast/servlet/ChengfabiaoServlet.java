package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ӡ ָ�����ֳ˷���
 * 
 * @author seawind
 * 
 */
public class ChengfabiaoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��������ύ���� number
		String numberStr = request.getParameter("number"); // ͨ�� input name �������
		int number = 0;
		try {
			number = Integer.parseInt(numberStr);
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			throw new RuntimeException("����Ĳ�������");
		}

		// ��ӡ �ž� ---����������
		PrintWriter out = response.getWriter();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				out.print(j + "*" + i + "=" + j * i + " ");
			}
			out.println("<br/>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
