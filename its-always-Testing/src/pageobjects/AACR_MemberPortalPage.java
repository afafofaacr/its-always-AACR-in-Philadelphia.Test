package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AACR_MemberPortalPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class AACR_MemberPortalPage {

	@TextType()
	@FindBy(xpath = "//span/span/span[contains(@class,'form-control') and starts-with(normalize-space(.),'1')]")
	public WebElement aacrId;
	@LinkType()
	@FindBy(linkText = "My Membership")
	public WebElement myMembership;
	@ButtonType()
	@FindByLabel(label = "Become a Member")
	public WebElement becomeAMember;
	@LinkType()
	@FindBy(linkText = "Logout")
	public WebElement logout;
	@LinkType()
	@FindBy(xpath = "//div[@id='wrapper']/div/div/div/div/ul/li/a[@aria-expanded='false']")
	public WebElement menuButton;
			
}
