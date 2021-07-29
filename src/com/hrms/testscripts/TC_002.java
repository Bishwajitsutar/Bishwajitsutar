package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_002 {
	@Test
	public void tc002() {
		DOMConfigurator.configure("Log4j.xml");
		General obj = new General();
		obj.OpenApplication();
		obj.Login();
		obj.Logout();
		obj.CloseAppication();
	}
}
