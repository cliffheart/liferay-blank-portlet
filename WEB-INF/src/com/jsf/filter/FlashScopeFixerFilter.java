package com.jsf.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

public class FlashScopeFixerFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FlashScopeFixerFilter");
		response.getWriter();
		HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse) response);
		wrapper.setBufferSize(10000000);
		chain.doFilter(request, wrapper);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

	@Override
	public void destroy() {
	}
}
