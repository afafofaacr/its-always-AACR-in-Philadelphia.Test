package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="MakeDeceased"                                
               , summary=""
               , connection="LP_UAT"
               , lightningComponent="MakeDeceased"
               , namespacePrefix=""
     )             
public class MakeDeceased {

	@TextType()
	@FindBy(xpath = "//div/textarea")
	public WebElement note;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='Note']/parent::div/parent::p/parent::div/following-sibling::footer//button[normalize-space(.)='Mark As Deceased']")
	public WebElement markAsDeceasedWithinConfirmationScreen;
	
}
