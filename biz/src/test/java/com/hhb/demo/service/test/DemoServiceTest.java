package com.hhb.demo.service.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hhb.demo.model.Demo;
import com.hhb.demo.service.DemoService;
import com.hhb.demo.service.test.base.ServiceAbstractTransactionBaseJunit4Test;

public class DemoServiceTest extends ServiceAbstractTransactionBaseJunit4Test{
	
	@Autowired
	private DemoService demoService;
	
	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}
	
	private Long id;

	@Test
	public void testInsertDemo() {
		Demo demo = new Demo();
		demo.setName("宝马");
		demo.setRemark("memo");
		this.demoService.insertDemo(demo);
		this.id=demo.getId();
		assertNotNull(demo.getId());
	}

	@Test
	public void testDeleteDemoById() {
		this.testInsertDemo();
		Demo demo = new Demo();
		demo.setId(id);
		Integer value = this.demoService.deleteDemoById(demo);
		assertTrue(value>0);
	}

	@Test
	public void testGetDemoList() {
		this.testInsertDemo();
		Demo demo = new Demo();
		demo.setId(id);
		List<Demo> list = this.demoService.getDemoList(demo);
		assertTrue(!list.isEmpty());
	}
	

	@Test
	public void testUpdateDemo() {
		this.testInsertDemo();
		Demo demo = new Demo();
		demo.setId(id);
		demo.setName("宝马");
		demo.setRemark("memo");
		Integer value = this.demoService.updateDemo(demo);
		assertTrue(value>0);
	}

}
