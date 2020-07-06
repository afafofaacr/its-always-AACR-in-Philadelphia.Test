package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="SF_BAMContainer"                                
               , summary=""
               , connection="LP_UAT"
               , lightningComponent="BAMContainer"
               , namespacePrefix=""
     )             
public class SF_BAMContainer {

	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
	
	/*@TextType()
	//@FindBy(id = document.getElementById("card_number").value)
	//@FindBy(id = "#card_number")
	public WebElement cardNumber;*/
	
	
//	@PageFrame()
	//public static class Frame {

		//@FindBy(xpath = "//iframe[contains(@id,'spreedly.com')]")
		//public Frame1 frame;
	//}
	/*@FindBy(xpath = "//iframe[contains(@src,'CreditCardPayment')]")
	public Frame frame;
	@PageFrame()
	public static class Frame1 {

		@TextType()
		@FindBy(xpath = "//input[@id='card_number']")
		public WebElement cardNumber;
	}*/
	
//Error doing interaction. Connection Name: LP_UAT, cause: [NoSuchElementException: Please specify a FindBy annotation for the Frame
	@FindBy(xpath = "//iframe[contains(@id,'spreedly-number-frame')]")
	@PageFrame()
	public static class Frame {

		@TextType()
		@FindBy(xpath = "//input[@id='card_number']")
		public WebElement cardNumber;
	}
	@FindBy(xpath = "//iframe[contains(@src,'CreditCardPayment')]")
	public Frame frame;
	@BooleanType()
	@FindBy(xpath = "(//span[@class='slds-radio_faux'])[1]")
	//@FindBy(xpath = "//label/span[normalize-space(.)='2020']")
	public WebElement RenewThrough2020Toggle;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Item Quick Add']/following-sibling::div//input")
	public WebElement itemQuickAdd;
	@TextType()
	@FindBy(xpath = "//span[@id='listbox-option-unique-id-01']")
	public WebElement itemQuickAddDropdown;
	@ButtonType()
	@FindByLabel(label = "Add to Order")
	public WebElement addToOrder;
	
	
	//@TextType()
	//@FindBy(xpath = "@*card_number")
	//public WebElement cardNumber;

	//@TextType()
	//@FindByLabel(label = "number-form")
	//@FindBy(xpath = "//label[normalize-space(.)='*card_number']")
	//public WebElement cardNumber;
}
