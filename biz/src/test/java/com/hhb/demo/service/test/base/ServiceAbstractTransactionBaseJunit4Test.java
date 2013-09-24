package com.hhb.demo.service.test.base;
/**
 * 
 */


import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @author hehaibo
 */
@ContextConfiguration(locations = {
		"classpath:spring/common/applicationContext.xml",
		"classpath:spring/common/dataSource.xml", "classpath:demo/demo.xml",
		"classpath:demo/demo-dao.xml","classpath:demo/demo-service.xml" })
@TransactionConfiguration(transactionManager = "demo_transactionManager")
public abstract class ServiceAbstractTransactionBaseJunit4Test extends
		AbstractTransactionalJUnit4SpringContextTests {
}
