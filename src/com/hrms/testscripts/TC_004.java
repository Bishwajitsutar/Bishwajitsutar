package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_004 {
	@Test
	public void tc004() {
		DOMConfigurator.configure("Log4j.xml");
		General obj = new General();
		obj.OpenApplication();
		obj.Login();
		obj.Delete_Emp();
		obj.Logout();
		obj.CloseAppication();
	}

}
