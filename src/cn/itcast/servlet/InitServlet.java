package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// 实现Servlet 接口  --- 感受生命周期
public class InitServlet implements Servlet {

	int i;

	public InitServlet() {
		System.out.println("构造了 InitServlet对象 ...");
	}

	@Override
	public void destroy() {
		System.out.println("销毁...");
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("初始化 ...");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("服务...");
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
