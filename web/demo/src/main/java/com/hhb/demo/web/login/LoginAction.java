package com.hhb.demo.web.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hhb.demo.web.base.BaseAction;

@Controller
@RequestMapping("/demo")
public class LoginAction extends BaseAction {
	public LoginAction(){
		System.out.println("doLogin");
	}
	
	@RequestMapping("/doLogin")
	protected ModelAndView doPost(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("demo/index");
		request.getSession().setAttribute("sessionObject", "hehaibo");
		return mv;
	}

}
