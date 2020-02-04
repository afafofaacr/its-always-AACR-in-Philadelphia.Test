package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_LoginPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_LoginPage {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Username']/following-sibling::input")
	public WebElement username;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Password']/following-sibling::input")
	public WebElement password;
	@ButtonType()
	@FindByLabel(label = "Login")
	public WebElement login;
			
}
