package com.hhb.demo.web.test.demo;

import static junit.framework.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;

import com.hhb.demo.web.login.LoginAction;
import com.hhb.demo.web.test.base.ActionAbstractTransactionBaseTest;

public class DemoActionTest extends ActionAbstractTransactionBaseTest {
	@Autowired
	private LoginAction loginAction;

	public void setLoginAction(LoginAction loginAction) {
		this.loginAction = loginAction;
	}
	public void testLogin(){
		assertEquals("success", "success");
	}
}
