package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// ʵ��Servlet �ӿ�  --- ������������
public class InitServlet implements Servlet {

	int i;

	public InitServlet() {
		System.out.println("������ InitServlet���� ...");
	}

	@Override
	public void destroy() {
		System.out.println("����...");
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("��ʼ�� ...");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("����...");
		System.out.println("i:" + i);
		i++;
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
