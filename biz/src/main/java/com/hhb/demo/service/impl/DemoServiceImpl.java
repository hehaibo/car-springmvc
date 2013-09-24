package com.hhb.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hhb.demo.dao.DemoDAO;
import com.hhb.demo.model.Demo;
import com.hhb.demo.service.DemoService;

public class DemoServiceImpl implements DemoService {
	@Autowired
	private DemoDAO demoDAO;

	public Long insertDemo(Demo demo) {
		return this.demoDAO.insert(demo);
	}

	public Integer deleteDemoById(Demo demo) {
		return this.demoDAO.deleteById(demo.getId());
	}

	public List<Demo> getDemoList(Demo demo) {
		return this.demoDAO.queryDemoList(demo);
	}
	
	public Integer updateDemo(Demo Demo) {
		return this.demoDAO.update(Demo);
	}
}
