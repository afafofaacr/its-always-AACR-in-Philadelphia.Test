package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="RenewPages"                                
     , summary=""
     , relativeUrl=""
     , connection="MyAACR_UAT"
     )             
public class RenewPages {

	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
	@PageFrame()
	public static class Frame {

		@FindBy(xpath = "//iframe[contains(@id,'spreedly-number-frame')]")
		public Frame1 frame;
	}
	@FindBy(xpath = "//iframe[contains(@src,'CreditCardPayment')]")
	public Frame frame;
	@PageFrame()
	public static class Frame1 {

		@TextType()
		@FindBy(xpath = "//input[@id='card_number']")
		public WebElement cardNumber;
	}
	@ButtonType()
	@FindByLabel(label = "Process Payment")
	public WebElement processPayment;
	@LinkType()
	@FindBy(linkText = "Return to Profile")
	public WebElement returnToProfile;
	@LinkType()
	@FindBy(linkText = "Logout")
	public WebElement logout;
	@ChoiceListType()
	@FindBy(xpath = "//div[@id='ccPaymentComp']/div/div/div/div/div/div/div/div/div/div/select[@id='2652:0']")
	public WebElement Exp_Year_Dropdown;
	@ChoiceListType()
	@FindBy(xpath = "//div[@id='ccPaymentComp']/div/div/div/div/div/div/div/div/div/div/select[@id='1440:0']")
	public WebElement ExpYear;
	@ChoiceListType()
	@FindBy(xpath = "//div[@id='ccPaymentComp']/div/div/div/div/div/div/div/div/div/div/select[contains(@class,'slds-select') and @data-aura-rendered-by='1334:0']")
	public WebElement ExpirationYear;	
			
}
