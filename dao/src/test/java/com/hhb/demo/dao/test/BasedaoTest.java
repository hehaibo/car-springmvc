package com.hhb.demo.dao.test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.hhb.common.dao.base.BaseDAO;
import com.hhb.demo.dao.test.daobase.AbstractTransactionBaseJunit4Test;
import com.hhb.demo.model.Demo;

public class BasedaoTest extends AbstractTransactionBaseJunit4Test {
	@Resource(name = "baseDAO")
	private BaseDAO baseDAO;
	private String namespace = "demo.";
	private Long id;

	@Test
	public void testInsert() {
		Demo demo = new Demo();
		demo.setName("宝马");
		demo.setRemark("memo");
		id = (Long) this.baseDAO.insert(namespace, "insertDemo", demo);
		assertTrue(id > 0);
	}

	@Test
	public void testUpdate() {
		this.testInsert();
		Demo demo = new Demo();
		demo.setId(id);
		demo.setName("宝马");
		demo.setRemark("memo");
		Integer result = this.baseDAO.update(namespace, "updateDemo", demo);
		assertTrue(result > 0);
	}

	@Test
	public void batchDelete() {
		this.testInsert();
		List<Long> list = new ArrayList<Long>();
		list.add(id);
		Integer result = this.baseDAO.batchDelete(namespace, "deleteDemoById",
				list);
		assertTrue(result > 0);
	}

	@Test
	public void testBatchInsert() {
		List<Demo> list = new ArrayList<Demo>();
		for (int i = 0; i < 10; i++) {
			Demo demo = new Demo();
			demo.setName("宝马" + i);
			demo.setRemark("memo" + i);
			list.add(demo);
		}
		Integer result = this.baseDAO
				.batchInsert(namespace, "insertDemo", list);
		assertTrue(result == 10);
	}

	@Test
	public void batchUpdate() {
		this.testInsert();
		List<Demo> list = new ArrayList<Demo>();
		Demo demo = new Demo();
		demo.setId(id);
		demo.setName("宝马");
		demo.setRemark("memo");
		list.add(demo);
		Integer result = this.baseDAO
				.batchUpdate(namespace, "updateDemo", list);
		assertTrue(result > 0);
	}

	@Test
	public void delete() {
		this.testInsert();
		this.baseDAO.deleteById(namespace, "deleteDemoById", new Long(1));
	}

	@Test
	public void testQueryForList() {
		this.testInsert();
		List<Demo> list = this.baseDAO.queryForList(namespace,
				"selectDemoList", null);
		assertTrue(list.size() > 0);
	}

	@Test
	public void testQueryForObjectById() {
		this.testInsert();
		Demo c = (Demo) this.baseDAO.queryForObjectById(namespace,
				"selectDemoById", new Long(1));
		System.out.println(c);
	}

	@Test
	public void testQueryForObject() {
		this.testInsert();
		Demo demo = new Demo();
		demo.setId(id);
		Demo c = (Demo) this.baseDAO.queryForObject(namespace, "selectDemo",
				demo);
		System.out.println(c);
	}

	@Test
	public void testQueryForMap() {
		this.testInsert();
		Map<String, Object> map = this.baseDAO.queryForMap(namespace,
				"selectDemoByName", "id", id);
		System.out.println(map);
		assertNotNull(map);
	}
}
