package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_PersonalInformationPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_PersonalInformationPage {
	@TextType()
	@FindBy(xpath = "//input[@name='Salutation']")
	public WebElement salutation;
	@TextType()
	@FindBy(xpath = "//input[@name='Title' and @type='text']")
	public WebElement title;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Move selection to Chosen']")
	public WebElement moveSelectionToChosen;
	@TextType()
	@FindBy(xpath = "//input[@name='OrderApi__Work_Phone__c']")
	public WebElement workPhone;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Birthdate']/following-sibling::div//input")
	public WebElement birthdate;
	@TextType()
	@FindBy(xpath = "//input[@name='Gender__c']")
	public WebElement gender;
	@TextType()
	@FindBy(xpath = "//input[@name='Race__c']")
	public WebElement race;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Address 1']/following-sibling::div//input")
	public WebElement address1;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='*Country']/following-sibling::div//select")
	public WebElement country;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*City']/following-sibling::div//input")
	public WebElement city;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='*State']/following-sibling::div//select")
	public WebElement state;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Zip']/following-sibling::div//input[@id='input-38']")
	public WebElement zip;
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;

			
}
