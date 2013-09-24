package com.hhb.demo.web.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public abstract class BaseAction extends AbstractController {

	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return this.doPost(request, response);
	}

	protected abstract ModelAndView doPost(HttpServletRequest request,
			HttpServletResponse response);
}
