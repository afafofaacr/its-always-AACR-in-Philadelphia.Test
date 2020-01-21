package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_EducationInformationPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_EducationInformationPage {

	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.simpleRecord.Name}']")
	public WebElement institutionName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Institution Name']/following-sibling::div//input")
	public WebElement institutionName1;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Date of expected Graduation']/following-sibling::div//input")
	public WebElement dateOfExpectedGraduation;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='*Academic Status']/following-sibling::div//select")
	public WebElement academicStatus;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Add Entry']")
	public WebElement addEntry;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement nextButton;
			
}
