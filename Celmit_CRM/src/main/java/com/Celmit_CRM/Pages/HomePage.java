package com.Celmit_CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Celmit_CRM.generic.BaseTest;

public class HomePage {
	
//	we are storing the element's address of home page here
	//Declaration
//	@FindBy(locatorName="locatorValue") accessSpecifier ReturnType elementName;
	@FindBy(xpath = "//a[text()='Campaigns']") private WebElement campaignsLink;
	@FindBy(xpath="//a[text()='Leads']")private WebElement LeadsLink;
	
	

	//Initialization
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

//Utilization
	//Address returning method
	public WebElement getCampaignsLink() {
		return campaignsLink;
	}
	
	//Action performing method
	public void clickCampaignLink()
	{
		campaignsLink.click();
	}
}
				
