package com.hhb.demo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import com.hhb.common.dao.base.BaseDAO;
import com.hhb.demo.dao.DemoDAO;
import com.hhb.demo.model.Demo;

public class DemoDAOImpl implements DemoDAO {
	private final String namespace = "demo.";
	@Resource(name = "baseDAO")
	private BaseDAO baseDAO;

	public Long insert(Demo demo) {
		return (Long) this.baseDAO.insert(namespace, "insertDemo", demo);
	}

	public Integer update(Demo demo) {
		return this.baseDAO.update(namespace, "updateDemo", demo);
	}

	public Integer deleteById(Long demoId) {
		return this.baseDAO.delete(namespace, "deleteDemoById", demoId);
	}

	public Demo queryDemoById(Long demoId) {
		return this.baseDAO.queryForObject(namespace, "selectDemoById", demoId);
	}

	public List<Demo> queryDemoList(Object param) {
		return this.baseDAO.queryForList(namespace, "selectDemoList", param);
	}
}
