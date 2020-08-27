package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_RegistrationPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_RegistrationPage {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*First Name']/following-sibling::div//input")
	public WebElement firstName1;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Last Name']/following-sibling::div//input")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Email']/following-sibling::div//input")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Password']/following-sibling::div//input")
	public WebElement password;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='*Password']/parent::lightning-input/following-sibling::div//button")
	public WebElement createAccount;
	//this id number generally changes on refresh
	@FindBy(id = "56:0")
	@TextType()
	public WebElement Affiliation;
	@TextType()
	@FindBy(xpath = "//span[@title='Provar Bot']")
	public WebElement provarAffiliationSelection;		
}
