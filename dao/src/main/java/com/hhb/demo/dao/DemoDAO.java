package com.hhb.demo.dao;

import java.util.List;

import com.hhb.demo.model.Demo;

public interface DemoDAO {

	public Long insert(Demo carType);

	public Integer update(Demo carType);

	public Integer deleteById(Long demoId);

	public Demo queryDemoById(Long demoId);
	
	public List<Demo> queryDemoList(Object param);

}