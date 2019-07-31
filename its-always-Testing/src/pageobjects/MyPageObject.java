package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(linkText = "Other")
	public WebElement other;
			
}
