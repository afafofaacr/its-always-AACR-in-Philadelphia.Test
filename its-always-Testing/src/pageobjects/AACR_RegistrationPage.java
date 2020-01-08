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
	@ChoiceListType(values = { @ChoiceListValue(value = "Provar Bot") })
	@FindBy(id = "58:0")
	public WebElement Affiliation;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Email']/following-sibling::div//input")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Password']/following-sibling::div//input")
	public WebElement password;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='*Password']/parent::lightning-input/following-sibling::div//button")
	public WebElement createAccount;
			
}
