package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="InnerModal"                                
               , summary=""
               , connection="LP_UAT"
               , lightningComponent="MembershipApprovalAndResignation"
               , namespacePrefix=""
     )             
public class InnerModal {

	@ButtonType()
	@FindBy(xpath = "//footer/button[normalize-space(.)='Resign']")
	public WebElement areYouSureResign;
	
}
