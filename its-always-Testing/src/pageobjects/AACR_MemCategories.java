package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_MemCategories"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_MemCategories {
	
	@ButtonType()
	@FindBy(xpath= "(//button[normalize-space(.)='Apply' and @title='Apply'])[1]")
	public WebElement ActiveMembershipApply;

	@ButtonType()
	@FindBy(xpath= "(//button[normalize-space(.)='Apply' and @title='Apply'])[2]")
	public WebElement AffiliateMembershipApply;
	
	@ButtonType()
	@FindBy(xpath= "(//button[normalize-space(.)='Apply' and @title='Apply'])[3]")
	public WebElement AssociateMembershipApply;
	
	@ButtonType()
	@FindBy(xpath= "(//button[normalize-space(.)='Apply' and @title='Apply'])[4]")
	public WebElement StudentMembershipApply;
	
			
}
