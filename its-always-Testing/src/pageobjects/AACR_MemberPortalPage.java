package pageobjects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
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
	@TextType()
	@FindBy(xpath = "(//article//span[@data-aura-class='uiOutputDate'])[2]")
	public WebElement ExpiresOnDate;
	@TextType()
	@FindBy(xpath = "//div[@class='slds-box slds-align_absolute-center active']")
	public WebElement DaysLeftBox;
	//Apply Regex to Days Left read from site to return only the number of days displayed
	public int daysLeftMath(String str){
	
		String daysNumber = str.replaceAll("([A-z ]*)", "").replace("\n","");
		
		return Integer.parseInt(daysNumber);
	}
	//If the person renewed to this current year, calculate expected number of days left
	//Adds 30 days because the Grace Period is 30 Days
	public int numDaysLeftCurrentYearMath(){ 
		LocalDate todayDate = java.time.LocalDate.now();
		LocalDate currentCTE = LocalDate.of(todayDate.getYear(), Month.DECEMBER, 31);
		currentCTE = currentCTE.plusDays(30);
		
		return (int) ChronoUnit.DAYS.between(todayDate, currentCTE);	
	}
	//If the person renewed to forthcoming year, calculate expected number of days left
	//Adds 30 days because the Grace Period is 30 Days
	public int numDaysLeftForthcomingYearMath(){
		LocalDate todayDate = java.time.LocalDate.now();
		LocalDate forthcomingCTE = LocalDate.of(todayDate.plusYears(1).getYear(), Month.DECEMBER, 31);
		forthcomingCTE = forthcomingCTE.plusDays(30);
		
		return (int) ChronoUnit.DAYS.between(todayDate, forthcomingCTE);
	}
	//Switch Logic, did they renew to current year (1) or next year (2)?
	public int whichYearRenewedTo(int isSuccessfulRenewValue){
		if(isSuccessfulRenewValue < 366){
		return 1;
		}
		return 2;
	}

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Forthcoming Year']")
	public WebElement forthcomingYear;
	@TextType()
	@FindBy(xpath = "(//div[@class='slds-text-heading_medium'])[4]")
	//@FindBy(xpath = "//label[normalize-space(.)='AACR ID']/parent::div/parent::fieldset/parent::form/parent::div/parent::div/parent::span/parent::span/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::body")
	public WebElement MyMembershipMessageNeedsAssistance;
}
