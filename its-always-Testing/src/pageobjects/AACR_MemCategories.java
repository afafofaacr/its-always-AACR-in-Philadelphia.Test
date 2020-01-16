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
	@FindBy(xpath = "//button[normalize-space(.)='Apply' and @value='a131I0000013GiDQAU']")
	public WebElement AffiliateMembership;
	
	@ButtonType()
	//@FindBy(xpath = "//button[@class='slds-button slds-button_neutral'][0]")
	//@FindBy(xpath = "//button[@class='slds-button slds-button_neutral'][0] and @title='Apply'")
	//@FindBy(xpath = "//button[@class='slds-button slds-button_neutral']/@id[0]")
	@FindBy(xpath = "//button[normalize-space(.)='Apply' and @value='a131I0000013GiDQAU']")
	public WebElement ActiveMembership;

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Apply' and @value='a131I0000013GimQAE']")
	public WebElement AffiliateMembershipApply;
			
}
