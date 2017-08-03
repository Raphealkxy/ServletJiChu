package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �û����� countservlet ���ʴ��� +1
 * 
 * @author seawind
 * 
 */
public class CountServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// ��ServletContext ������ʴ��� 0
		// ���ServletContext����
		ServletContext context = getServletContext();
		// �������� setAttribute
		context.setAttribute("visittimes", 0);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ÿ�η��� ִ�� doGet --- ��visittimes ���� +1

		// 1 ��ServletContext�л�� ���ʴ���
		ServletContext context = getServletContext();
		int times = (Integer) context.getAttribute("visittimes");

		// 2�����ʴ��� +1
		times++;

		// 3�������ʴ������»�ȥ ServletContext
		context.setAttribute("visittimes", times);

		System.out.println("��վ��������һ�Σ�");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
