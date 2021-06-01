package com.Celmit_CRM.OPerations;



import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Celmit_CRM.Pages.LoginPage;
import com.Celmit_CRM.generic.FileLib;
import com.Celmit_CRM.generic.WebDriverCommonLib;
import com.Celmit_CRM.generic.BaseTest;

@Listeners(com.Celmit_CRM.generic.MyListeners.class)
public class ValidLoginTest extends BaseTest{
	
	public void loginToApp() throws Throwable {
		LoginPage lp =new LoginPage();
		FileLib fl= new FileLib();
		lp.login(fl.readPropData(PROP_PATH,"username"), fl.readPropData(PROP_PATH,"password"));
		WebDriverCommonLib wd =new com.Celmit_CRM.generic.WebDriverCommonLib();
		wd.waitForPage(fl.readPropData(PROP_PATH,"homeTitle"));
		wd.verify(wd.getPageTitle(), fl.readPropData(PROP_PATH,"homeTitle"),"Home page");
	}
	
}
