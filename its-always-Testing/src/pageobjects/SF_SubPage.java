package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SF_SubPage"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class SF_SubPage {

	@LinkType()
	//@FindBy(xpath = "(//li/a[contains(@class,'forceBreadCrumbItem')])[1]")
	//@FindBy(xpath = "(//div[contains(@class,'slds-media__body slds-align-middle')]//span[@class='uiOutputText'])[2]")
	@FindBy(xpath="(//li/a[contains(@class,'forceBreadCrumbItem')])[last()]")
	public WebElement SubReferenceLink;
	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;
	@ButtonType()
	@FindByLabel(label = "Amend Subscription")
	public WebElement amendSubscription;
	@ButtonType()
	@FindBy(xpath = "(//button[@name='Edit' and contains(@class,'slds-button')])[2]")
	public WebElement edit2;
	@TextType()
	@FindBy(xpath = "//input[@name='OrderApi__Current_Term_Start_Date__c']")
	public WebElement InlineSubTermStartDate;
	@TextType()
	@FindBy(xpath = "//input[@name='OrderApi__Current_Term_End_Date__c']")
	public WebElement InlineSubTermEndDate;
	@TextType()
	@FindBy(xpath = "//input[@name='OrderApi__Activated_Date__c']")
	public WebElement InlineSubPaidDate;
	@TextType()
	@FindBy(xpath = "//input[@name='OrderApi__Grace_Period_End_Date__c']")
	public WebElement InlineSubGracePeriodEndDate;
	@ButtonType()
	@FindBy(xpath = "//lightning-button/button[normalize-space(.)='Save']")
	public WebElement InlineSubSave;
			
}
