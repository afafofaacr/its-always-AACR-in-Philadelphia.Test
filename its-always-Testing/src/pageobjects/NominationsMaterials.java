package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="NominationsMaterials"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class NominationsMaterials {

	@ButtonType()
	@FindBy(xpath = "//label[@id='file-selector-label-147']/span[normalize-space(.)='Upload Files']")
	public WebElement BibliographyUpload;
			
}
