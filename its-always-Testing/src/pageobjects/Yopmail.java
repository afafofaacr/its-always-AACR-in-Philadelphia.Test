package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Yopmail"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class Yopmail {

	@TextType()
	@FindBy(id = "login")
	public WebElement login;
			
}
