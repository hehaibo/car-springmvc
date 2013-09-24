package com.hhb.demo.service;

import java.util.List;

import com.hhb.demo.model.Demo;

public interface DemoService {
	public Long insertDemo(Demo demo);

	public Integer updateDemo(Demo demo);

	public Integer deleteDemoById(Demo Demo);

	public List<Demo> getDemoList(Demo demo);
}
