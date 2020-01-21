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
	@TextType()
	@FindBy(xpath = "//div[@id='myMembership']/div/div/div/div/div[normalize-space(.)='Your application has been submitted and is awaiting approval. Please check back soon or contact membership at membership@aacr.org.']")
	public WebElement myMembershipMessageNeedsApproval;
	@TextType()
	@FindBy(xpath = "//article//div/img")
	public WebElement membershipBadge;
	@ButtonType()
	@FindByLabel(label = "Launch Directory")
	public WebElement launchDirectory;
	
	public int membershipType(String str){
	
		if(str.contains("Active")){
			return 1;
		}
		else if(str.contains("Affiliate")){
			return 2;
		}
		else if(str.contains("Associate")){
			return 3;
		}		
		return 4;
	}

	@ButtonType()
	@FindByLabel(label = "Current Year")
	public WebElement currentYear;
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
}
