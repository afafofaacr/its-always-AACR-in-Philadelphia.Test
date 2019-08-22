package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="PersonalInformationPage"                                
               , summary=""
               , connection="LP_UAT"
               , lightningComponent="JP_Container"
               , namespacePrefix=""
     )             
public class PersonalInformationPage {

	@TextType()
	@FindBy(xpath = "//input[@name='Salutation']")
	public WebElement salutation;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@aura:id= 'gender']", qualifier = "Gender__c")
	@SalesforceField(name = "Gender__c", object = "Contact")
	public WebElement gender;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@aura:id= 'race']", qualifier = "Race__c")
	@SalesforceField(name = "Race__c", object = "Contact")
	public WebElement race;
	@AuraBy(componentXPath = "//lightning:inputField[@aura:id= 'WorkPhone']", qualifier = "OrderApi__Work_Phone__c")
	@SalesforceField(name = "OrderApi__Work_Phone__c", object = "Contact")
	public WebElement workPhone;
	@TextType()
	@FindBy(xpath = "//input[@id='input-31']")
	public WebElement address1;
	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@value= '{!v.address.countryCode}']")
	public WebElement country;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='*Country']/following-sibling::div//select")
	public WebElement country1;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*City']/following-sibling::div//input")
	public WebElement city;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='*State']/following-sibling::div//select")
	public WebElement state;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.contactRecord.Birthdate}']")
	public WebElement birthdate;
	@AuraBy(componentXPath = "//lightning:inputField[@aura:id= 'degrees']", qualifier = "Degrees_Held__c")
	@SalesforceField(name = "Degrees_Held__c", object = "Contact")
	public WebElement Degrees_Held;
	@ButtonType()
	@AuraBy(componentXPath = "//lightning:inputField[@aura:id= 'degrees']", qualifier = "Degrees_Held__c")
	@SalesforceField(name = "Degrees_Held__c", object = "Contact")
	public WebElement moveSelectionToChosen;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Move selection to Chosen']")
	public WebElement moveSelectionToChosen1;
	@AuraBy(componentXPath = "//lightning:inputField[@aura:id= 'title']", qualifier = "Title")
	@SalesforceField(name = "Title", object = "Contact")
	public WebElement title;
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
	@TextType()
	@AuraBy(componentXPath = "//lightning:dualListbox[@value= '{!v.majorFocusValues}']")
	public WebElement majorFocusValues;
	@ButtonType()
	@AuraBy(componentXPath = "//lightning:dualListbox[@value= '{!v.majorFocusValues}']")
	public WebElement majorFocusValues1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"slds-grid\")]/div[1]/lightning-dual-listbox[1]/div/div[2]/div/div[4]/lightning-button-icon[1]//button[contains(@class,'slds-button') and @title='Move selection to Selected Items']")
	public WebElement majorFocusValues31;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.nominator1.memberNo}']")
	public WebElement memberNom1;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.nominator2.memberNo}']")
	public WebElement memberNom2;
	@ButtonType()
	@FindByLabel(label = "nominator1")
	public WebElement nominator1Verify;
	@ButtonType()
	@FindByLabel(label = "nominator2")
	public WebElement nominator2Verify;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@required='{!v.required}']", qualifier = "file2")
	public WebElement VInputLabel_BothFileLocationsAtOnce;
	@TextType()
	@FindBy(xpath = "//label[@id='file-selector-label-147']/span[normalize-space(.)='Upload Files' and contains(@class,'slds-file-selector__button')]")
	public WebElement UploadFiles_Left;
	@BooleanType()
	@FindByLabel(label = "DeclineJournal")
	public WebElement decline;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Decline']")
	public WebElement Decline;
	
}
