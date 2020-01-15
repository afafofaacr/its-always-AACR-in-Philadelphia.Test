package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_JournalSelectionsPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_JournalSelectionsPage {

	@ChoiceListType()
	@FindBy(xpath = "//input[@name='complimentaryJournalsOnline']")
	public WebElement selectCompJournal;
/*	@BooleanType()
	@FindBy(xpath = ("(//span[contains(@class,'slds-radio_faux')])[4]"))
	public WebElement primaryAddressRadioButton;*/
	/*@BooleanType()
	@AuraBy(componentXPath = "//lightning:input[@aura:id= 'primaryAddress']", qualifier = "primaryAddress")
	public WebElement primaryAddress;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Primary Address']/span[contains(@class,'slds-radio_faux')]")
	public WebElement primaryAddressbutton;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Primary Address']/span[contains(@class,'slds-radio_faux')]")
	public WebElement primaryAddressSelectButton;
	@BooleanType()
	@AuraBy(componentXPath = "//lightning:input[@aura:id= 'primaryAddress']", qualifier = "primaryAddress")
	public WebElement primaryAddressLastTime;*/
	/*@BooleanType()
	@FindBy(xpath = "(//label[normalize-space(.)='Online']/parent::span/parent::div/parent::div/parent::fieldset/parent::lightning-radio-group/parent::div/parent::div/following-sibling::div//span[contains(@class,'slds-radio_faux')])[1]")
	public WebElement primaryAddress;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Primary Address']/span[contains(@class,'slds-radio_faux')]")
	public WebElement primaryAddressv2;
	@BooleanType()
	@FindBy(xpath="//input[@name='primaryAddress']")
	public WebElement primaryAddressv3;
		@BooleanType()
	@FindBy(xpath="//span[@class ='slds-radio']/input[@name='primaryAddress']")
	public WebElement primaryAddressv4;*/
	@ChoiceListType()
	@FindBy(xpath="//span[@class ='slds-radio']/input[@name='primaryAddress']")
	public WebElement primaryAddress;
/*	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;*/
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement nextButton;
			
}
