package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_DonationsPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_DonationsPage {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement nextButton;
			
}
