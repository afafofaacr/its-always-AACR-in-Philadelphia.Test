package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="RegistrationPage"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class RegistrationPage {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Create New Account']")
	public WebElement createNewAccount;
	@LinkType()
	@FindBy(linkText = "Logout")
	public WebElement logout;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Username']/following-sibling::input")
	public WebElement Username;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Password']/following-sibling::input")
	public WebElement Password;
	@ButtonType()
	@FindByLabel(label = "Login")
	public WebElement login;
			
}
