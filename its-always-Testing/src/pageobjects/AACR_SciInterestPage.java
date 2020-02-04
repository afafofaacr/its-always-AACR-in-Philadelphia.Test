package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_SciInterestPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_SciInterestPage {

	@TextType()
	@AuraBy(componentXPath = "//lightning:dualListbox[@value= '{!v.majorFocusValues}']")
	public WebElement majorFocusValues;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"slds-grid\")]/div[1]/lightning-dual-listbox[1]/div/div[2]/div/div[4]/lightning-button-icon[1]//button[contains(@class,'slds-button') and @title='Move selection to Selected Items']")
	public WebElement majorFocusAddArrow;
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.contactRecord.Other_Research_Areas__c}']")
	public WebElement ifOtherPleaseSpecify;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='If Other, Please Specify']/following-sibling::div//input")
	public WebElement ifOther;
	@TextType()
	@FindByLabel(label = "Research Area of Expertise")
	public WebElement researchAreaOfExpertiseDropDown;
	@TextType()
	@FindBy(xpath = "//input[@name='majorFocus']")
	public WebElement MajorFocusDropDown;
			
}
