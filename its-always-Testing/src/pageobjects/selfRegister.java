package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="selfRegister"                                
               , summary=""
               , connection="LP_UAT"
               , lightningComponent="selfRegister"
               , namespacePrefix=""
     )             
public class selfRegister {

	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@aura:id= 'firstname']")
	public WebElement firstName;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@aura:id= 'lastname']")
	public WebElement lastName;
	@TextType()
	@FindBy(id = "58:0")
	public WebElement _;
	@TextType()
	@FindBy(xpath = "//span[@id='listbox-option-unique-id-01']/span/span[normalize-space(.)='Provar Bot']")
	public WebElement AffiliationDropDownExpanded;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@aura:id= 'email']")
	public WebElement email;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@aura:id= 'password']")
	public WebElement password;
	@ButtonType()
	@AuraBy(componentXPath = "//lightning:button[@label= 'Create Account']")
	public WebElement createAccount;
	
}
