package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SF_TermPage"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class SF_TermPage {

/*	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement SaveEdit;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Current Term Start Date** System Calculated Required Override ** The start date for the current subscription term.']/following-sibling::div//input")
	public WebElement OrderApi__Current_Term_Start_Date__c;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Current Term End Date** System Calculated Required Override ** The end date (Expiration Date) for the current subscription term.']/following-sibling::div//input")
	public WebElement OrderApi__Current_Term_End_Date__c;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)=concat('Grace Period End DateThis date is calculated by the Paid Through Date plus the number of days defined on the Subscription Plan',\"'\",'s Grace Period field.')]/following-sibling::div//input")
	public WebElement OrderApi__Grace_Period_End_Date__c;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Activated Date** System Calculated Required Override ** The date the Subscription was activated.']/following-sibling::div//input")
	public WebElement OrderApi__Activated_Date__c;*/
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Save' and @title='Save']")
	public WebElement save;
	@ButtonType()
	//@FindByLabel(label = "Edit") //this pulls up the editing for the sub
	@FindBy(xpath = "(//button[normalize-space(.)='Edit' and contains(@class,'slds-button')])[2]") //editing for first term
	public WebElement EditTerm;
	@TextType()
	@FindBy(xpath = "//input[@name='OrderApi__Term_Start_Date__c']")
	public WebElement InlineTermStartDate;
	@TextType()
	@FindBy(xpath = "//input[@name='OrderApi__Term_End_Date__c']")
	public WebElement InlineTermEndDate;
	@TextType()
	@FindBy(xpath = "//input[@name='OrderApi__Grace_Period_End_Date__c']")
	public WebElement InlineGracePeriodEndDate;
	@TextType()
	@FindBy(xpath = "//input[@name='OrderApi__Renewed_Date__c']")
	public WebElement InlinePaidDate;
	@ButtonType()
	@FindBy(xpath = "//lightning-button/button[normalize-space(.)='Save']")
	public WebElement InlineSave;
			
}
