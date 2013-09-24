package com.hhb.demo.web.test.base;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @author wb_shangkun.liusk
 */
@ContextConfiguration(locations = {
		"classpath:spring/common/applicationContext.xml",
		"classpath:spring/common/dataSource.xml", "classpath:demo/demo.xml",
		"classpath:demo/demo-dao.xml", "classpath:demo/demo-service.xml",
		"classpath:demo/demo-action.xml" })
@TransactionConfiguration(transactionManager = "demo_transactionManager")
public abstract class ActionAbstractTransactionBaseTest extends
		AbstractTransactionalJUnit4SpringContextTests {
}
