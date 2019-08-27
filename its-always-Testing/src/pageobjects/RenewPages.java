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
	@ChoiceListType()
	@FindBy(id = "1284:0")
	public WebElement _;
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
			
}
