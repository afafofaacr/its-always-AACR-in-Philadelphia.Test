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
	@FindBy(xpath="(//div[@class='slds-card__body']//input)[1]")
	public WebElement Nominator1;
	@TextType()
	@FindBy(xpath="(//div[@class='slds-card__body']//input)[3]")
	public WebElement Nominator2;
	@ButtonType(file=true)
	@FindBy(xpath = "(//div/lightning-primitive-file-droppable-zone//input)[1]")
	public WebElement BibliographyUpload;
	@ButtonType(file=true)
	@FindBy(xpath = "(//div/lightning-primitive-file-droppable-zone//input)[2]")
	public WebElement CurriculumVitae;
	@ButtonType(file=true)
	@FindBy(xpath = "(//div/lightning-primitive-file-droppable-zone//input)[3]")
	public WebElement ThirdFileUpload;
	@ButtonType(file=true)
	@FindBy(xpath = "(//div/lightning-primitive-file-droppable-zone//input)[4]")
	public WebElement FourthFileUpload;
	@ButtonType()
	@FindByLabel(label = "nominator1")
	public WebElement nominator1Verify;
	@ButtonType()
	@FindByLabel(label = "nominator2")
	public WebElement nominator2Verify;
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Nominator Title']/following-sibling::div//input")
	public WebElement nominatorTitle;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Nominator Name']/following-sibling::div//input")
	public WebElement nominatorName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Nominator Type']/following-sibling::div//input")
	public WebElement nominatorType;
			
}
