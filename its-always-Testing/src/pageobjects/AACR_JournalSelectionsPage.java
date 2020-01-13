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

	@TextType()
	@AuraBy(componentXPath = "//lightning:combobox[@value= '{!v.selectedComp}']")
	public WebElement selectCompJournal;
	@BooleanType()
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
	public WebElement primaryAddressLastTime;
			
}
