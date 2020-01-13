package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_NomAndMatsPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_NomAndMatsPage {

	@TextType()
	@FindBy(xpath = "//input[@id='input-142']")
	public WebElement Nominator1;
	@TextType()
	@FindBy(xpath = "//input[@id='input-146']")
	public WebElement Nominator2;
	@ButtonType(file=true)
	@FindBy(xpath = "(//div/lightning-primitive-file-droppable-zone//input)[1]")
	public WebElement BibliographyUpload;
	@ButtonType(file=true)
	@FindBy(xpath = "//div/lightning-primitive-file-droppable-zone//input[@id='input-file-152' and @type='file']")
	public WebElement CurriculumVitae;
	@ButtonType()
	@FindByLabel(label = "nominator1")
	public WebElement nominator1Verify;
	@ButtonType()
	@FindByLabel(label = "nominator2")
	public WebElement nominator2Verify;
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
			
}
