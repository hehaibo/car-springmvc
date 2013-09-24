package com.hhb.demo.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;

import edu.emory.mathcs.backport.java.util.Arrays;

public class LoginFilter implements Filter {
	private List<String> passthruPathList = new ArrayList<String>();
	private List<String> excludes = new ArrayList<String>();

	@SuppressWarnings("unchecked")
	public void init(FilterConfig filterConfig) throws ServletException {
		String passthru = filterConfig.getInitParameter("passthruPath");
		String excludesString = filterConfig.getInitParameter("excludes");

		if (StringUtils.isNotEmpty(passthru)) {
			passthruPathList.addAll(Arrays.asList(StringUtils.split(passthru,
					",; ")));
		}
		if (StringUtils.isNotEmpty(excludesString)) {
			excludes.addAll(Arrays.asList(StringUtils.split(excludesString,
					",; ")));
		}
	}

	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String requestURI = request.getRequestURI();
		for (String exclude : this.excludes) {
			if (requestURI.endsWith(exclude)) {
				chain.doFilter(request, response);
				return;
			}
		}
		HttpSession session = request.getSession();
		if (session.getAttribute("sessionObject") == null) {
			if (StringUtils.equals(requestURI, "/login.jsp")
					|| StringUtils.equals(requestURI, "/demo/doLogin.do")) {
				chain.doFilter(request, response);
			} else {
				response.sendRedirect("/login.jsp");
			}
		} else {
			chain.doFilter(request, response);
		}
	}

	public void destroy() {
		this.passthruPathList = null;
	}
}
