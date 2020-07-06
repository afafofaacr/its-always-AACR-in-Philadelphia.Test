package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="SF_ContactRecordButtonsOntop"                                
               , summary=""
               , connection="LP_UAT"
               , lightningComponent="outputNameWithHierarchyIcon"
               , namespacePrefix="sfa"
     )             
public class SF_ContactRecordButtonsOntop {

	@LinkType()
	@FindBy(linkText = "Edit")
	public WebElement edit;
	
}
