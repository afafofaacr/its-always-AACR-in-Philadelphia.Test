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
