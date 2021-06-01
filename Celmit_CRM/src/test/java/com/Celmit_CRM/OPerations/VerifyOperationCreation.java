package com.Celmit_CRM.OPerations;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Celmit_CRM.Pages.CreateCampaignPage;
import com.Celmit_CRM.Pages.DisplayingCustomerViewDetailsPage;
import com.Celmit_CRM.Pages.HomePage;
import com.Celmit_CRM.generic.FileLib;
import com.Celmit_CRM.generic.WebDriverCommonLib;
import com.Celmit_CRM.generic.BaseTest;



@Listeners(com.Celmit_CRM.generic.MyListeners.class)
public class VerifyOperationCreation extends BaseTest{

  @Test
	public void verifyOperationTest() throws Throwable {
	//"Open the browser and enter the test url and Click on Go button" AND VERIFY Login Page

	//	Login to App and verify HOME PAGE
	ValidLoginTest vl=new ValidLoginTest();
	vl.loginToApp();
	
//	click on operation module 
	HomePage hp= new HomePage() ;
	WebDriverCommonLib  wdlib= new WebDriverCommonLib();
	FileLib flib=new FileLib();
	
	wdlib.waitForPage(flib.readPropData(PROP_PATH, "homeTitle"));
	hp.clickCampaignLink();
	//FileLib flib=new FileLib();
	
	wdlib.verify(wdlib.getPageTitle(),flib.readPropData(PROP_PATH,"customViewTitle"),"custom view page"); 
	
	//click on New operation button
	DisplayingCustomerViewDetailsPage dc=new DisplayingCustomerViewDetailsPage();
	dc.clickNewCampaignBtn();
	//wdlib.verify(wdlib.getPageTitle(), flib.readPropData(PROP_PATH, "CreateCampaignTitle"), "Create Campaign Page");
	
	CreateCampaignPage cc=new CreateCampaignPage();
	cc.enterCampaignName("prasanna");
	cc.clicksavebtn();
	hp.clickCampaignLink();
	Thread.sleep(2000);
	dc.verifyCampaignCreation("prasanna");
	//dc.clickgopiLink();
	//wdlib.verify(wdlib.getPageTitle(), flib.readPropData(PROP_PATH, "campaignDetailspage"), "CampaignDetails Page");
	//CampaignDetailsPage Cdp=new CampaignDetailsPage();
	//Cdp.clickEditBtn();
	//wdlib.verify(wdlib.getPageTitle(), flib.readPropData(PROP_PATH, "editCampaignName"), " editDetails Page");
	//EditDetailsPage edp=new EditDetailsPage();
	//edp.enterNumSent("20");
	//Thread.sleep(2000);
	//edp.clickNewSaveBtn();
	
}
}
