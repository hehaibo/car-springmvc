package com.hhb.demo.web.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.hhb.demo.web.base.BaseAction;

@Controller("/index")
public class IndexAction extends BaseAction {

	protected ModelAndView doPost(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView("index");
	}
}
