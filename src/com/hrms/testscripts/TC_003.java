package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_003 {
	@Test
public void tc003() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
	General obj = new General();
	obj.OpenApplication();
	obj.Login();
	obj.Add_Emp();
	obj.Logout();
	obj.CloseAppication();
			}
}
