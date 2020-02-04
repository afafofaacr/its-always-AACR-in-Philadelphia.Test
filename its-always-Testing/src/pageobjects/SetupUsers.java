package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SetupUsers"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class SetupUsers {

	@PageFrame()
	public static class Frame {

		@ButtonType()
		@FindByLabel(qualifierXpath = "//@ Save ", label = " Save ")
		public WebElement Save;
		@ChoiceListType()
		@FindByLabel(label = "Profile")
		public WebElement profile;
		@ButtonType()
		@FindBy(xpath = "//td[@id='bottomButtonRow']/input[@name='save']")
		public WebElement save;
		@ChoiceListType()
		@FindByLabel(label = "Profile")
		public WebElement profile1;
		@ButtonType()
		@FindBy(xpath = "//td[@id='topButtonRow']/input[@name='save']")
		public WebElement save1;
		@ButtonType()
		@FindByLabel(label = "Reset Password")
		public WebElement resetPassword;
	}

	@FindBy(css = "iframe")
	public Frame frame;
			
}
