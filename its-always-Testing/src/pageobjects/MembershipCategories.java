package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="MembershipCategories"                                
               , summary=""
               , connection="LP_UAT"
               , lightningComponent="MembershipCategories"
               , namespacePrefix=""
     )             
public class MembershipCategories {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Apply' and @value='a131I0000013GiDQAU']")
	public WebElement ActiveMembershipApply;
	
}
