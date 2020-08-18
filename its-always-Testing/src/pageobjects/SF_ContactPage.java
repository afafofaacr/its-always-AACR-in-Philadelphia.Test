package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SF_ContactPage"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class SF_ContactPage {

	@ButtonType()
	@FindByLabel(label = "Renew")
	public WebElement renew;
	@ButtonType()
	@FindByLabel(label = "New Application")
	public WebElement newApplication;
	@ButtonType()
	@FindByLabel(label = "Resign")
	public WebElement resign;	
	public int strToNum(int num){
		return num;
	}
	//Link to the Contact when you are on the Badges List page
	@LinkType()
	@FindBy(xpath = "(//a[contains(@class,'forceBreadCrumbItem')])[2]")
	public WebElement ContactOnTheBadges;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Edit']")
	public WebElement edit;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Change Record Type']")
	public WebElement ContactRecordTypeButton;
	@ButtonType()
	@FindByLabel(label = "Approve")
	public WebElement approve;
	@ButtonType()
	@FindByLabel(label = "Mark As Deceased")
	public WebElement markAsDeceased;	
	@ButtonType()
	@FindBy(xpath = "//*[@id='brandBand_2']/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___lightning_membership_contact_view___contact___view/forcegenerated-flexipage_lightning_membership_contact_view_contact__view_js/record_flexipage-record-page-decorator/div/slot/flexipage-record-home-with-subheader-template-desktop2/div/div[3]/div[1]/slot/slot/flexipage-component2[1]/slot/flexipage-aura-wrapper/div/div/ul/li[2]/section/div/footer/button[2]")
	public WebElement approveConfirmed;	
}
