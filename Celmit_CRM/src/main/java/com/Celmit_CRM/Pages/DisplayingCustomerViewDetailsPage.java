package com.Celmit_CRM.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.Celmit_CRM.generic.BaseTest;

public class DisplayingCustomerViewDetailsPage {
         
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement NewCampaignBtn;
	@FindBy(xpath = "//table[@class='secContent']//tbody//tr[*]//td[@class=\"tableData\"][3]")
	private List<WebElement> campaignList;
	@FindBy(xpath = "//input[@value= 'New Lead']")
	private WebElement NewLeadBtn;
	@FindBy(xpath = "//a[text()='Gopi_123']']")
	private WebElement GopiLink;

	public DisplayingCustomerViewDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);

	}

	public WebElement getNewCampaignBtn() {
		return NewCampaignBtn;
	}

	public void clickNewCampaignBtn() {
		NewCampaignBtn.click();

	}

	public List<WebElement> getCampaignList() {
		return campaignList;
	}

	public void verifyCampaignCreation(String campaign) {
		for (WebElement oneCampaign : campaignList) {
			String campaignName = oneCampaign.getText();
			if (campaignName.equals(campaign)) {
				Reporter.log("Our Campaign is Created", true);
				break;
			} else {
				Reporter.log("Our Campaign is not Created", true);
			}
		}

	}
}
      
	   

