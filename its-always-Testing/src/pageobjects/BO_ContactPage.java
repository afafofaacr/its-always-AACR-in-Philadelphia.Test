package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BO_ContactPage"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class BO_ContactPage {

	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
	
	@ButtonType()
	@FindByLabel(label = "Process Payment")
	public WebElement processPayment;
	
	
	/*@ChoiceListType(values = {
	@ChoiceListValue(value = "2033", title = "2033")
	})
	@FindBy(xpath = "//div[@class='slds-select_container']//option[@value='2033']")
	public WebElement expYear;*/
	
	//@TextType()
	//@FindBy(xpath = "//div[@class='slds-select_container']//option[@value='2033']")
	@ChoiceListType()
	@FindBy(xpath = "//div[@class='slds-select_container']//option[@value='2033']")
	public WebElement expYear;
	
	
	//nested frame logic for Card Number
	@PageFrame()
	public static class Frame {

		@FindBy(xpath = "//iframe[contains(@id,'spreedly-number-frame')]")
		public Frame1 frame;
	}
	
	@FindBy(xpath = "//iframe[contains(@src,'CreditCardPaymentFrame')]")
	public Frame frame;
	
	@PageFrame()
	public static class Frame1 {

		@TextType()
		@FindBy(xpath = "//input[@id='card_number']")
		public WebElement cardNumber;
	}


	//nested frame logic for CVV
	@PageFrame()
	public static class FrameCVV {

		@FindBy(xpath = "//iframe[contains(@id,'spreedly-cvv-frame')]")
		public FrameCVVInner frame;
	}
	
	@FindBy(xpath = "//iframe[contains(@src,'CreditCardPaymentFrame')]")
	public FrameCVV frameForCvv;
	
	@PageFrame()
	public static class FrameCVVInner {
	
		@TextType()
		@FindBy(xpath = "//input[@id='cvv']")
		public WebElement cvv;
	}			
	
	
	
	
	/*	@PageFrame()
	public static class FrameCvv {

		@FindBy(xpath = "//iframe[contains(@id,'spreedly-number-frame')]")
		public Frame2Cvv framecvvvar;
	}
	
	@FindBy(xpath = "//iframe[contains(@src,'CreditCardPaymentFrame')]")
	public FrameCvv framecvvvar;
	
	@PageFrame()
	public static class Frame2Cvv {

		@TextType()
		@FindBy(xpath = "//input[@id='cvv']")
		public WebElement cvv;
	}	*/	
			
			
}
