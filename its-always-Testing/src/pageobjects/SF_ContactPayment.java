package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.*;

@Page( title="SF_ContactPayment"                                
, summary="The Fonteva Payment Component"
, connection="LP_UAT"
		)             
public class SF_ContactPayment {

WebDriver driver;

public SF_ContactPayment(WebDriver driver)
{
this.driver=driver;
}


	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[@title='Next']")
	public WebElement Nextbutton;
	@ChoiceListType()
	@FindBy(xpath = "//div[@class='slds-select_container']//option[@value='2033']")
	public WebElement expYear;
	@ButtonType()
	@FindByLabel(label = "Process Payment")
	public WebElement processPayment;
	@TextType()
	@FindBy(xpath = "(//input)[21]")
	public WebElement waiveCode;
	@ButtonType()
	@FindByLabel(label = "Apply")
	public WebElement apply;

	@PageFrame()
	public static class OuterFrame{
		//your code goes here
		@PageFrame()
		public static class InnerFrame{

			@TextType()
			@FindBy(xpath = "//input[@name='card_number']")
			public WebElement CCNumber;

		}
		@FindBy(xpath = "//iframe[contains(@name,'spreedly-number-frame')]")
		public InnerFrame CCNInnerFrame;
		
		@PageFrame()
		public static class InnerFrame1{

			@TextType()
			@FindBy(xpath = "//input[@id='cvv']")
			public WebElement CVVNumber;

		}
		@FindBy(xpath = "//iframe[contains(@name,'spreedly-cvv-frame')]")
		public InnerFrame1 CVVInnerFrame;
	}
	@FindBy(xpath = "(//div[@data-name='ccPaymentComp']//iframe)[1]")
	public OuterFrame CCNOuterFrame;
	
	public void waitFrame()
	{
	WebDriverWait wait = new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
	(driver.findElement(By.xpath("(//div[@data-name='ccPaymentComp']//iframe)[1]"))));
	
	//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
	//(driver.findElement(By.xpath("//iframe[contains(@name,'spreedly-number-frame')]"))));
	
	driver.switchTo().defaultContent();
	
	}
	@ButtonType()
	@FindByLabel(label = "Cancel Order")
	public WebElement cancelOrder;
	//Process Order appears if there is no cost for the purchase
	@ButtonType()
	@FindByLabel(label = "Process Order")
	public WebElement processOrder;
}
