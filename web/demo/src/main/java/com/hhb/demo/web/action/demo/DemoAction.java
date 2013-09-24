package com.hhb.demo.web.action.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.hhb.demo.model.Demo;
import com.hhb.demo.service.DemoService;
import com.hhb.demo.web.base.BaseAction;

@Controller("/demo")
public class DemoAction extends BaseAction {
	private static final long serialVersionUID = -9092602828750120333L;

	@Autowired
	private DemoService demoService;

	private Demo demo;

	public DemoService getDemoService() {
		return demoService;
	}

	public Demo getDemo() {
		return demo;
	}

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

	protected ModelAndView doPost(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		return new ModelAndView("");
	}

}
