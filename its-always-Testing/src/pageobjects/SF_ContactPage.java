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
}
