package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SetupProfChanged"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class SetupProfChanged {

	@PageFrame()
	public static class Frame {

		@ButtonType()
		@FindBy(xpath = "//td[@id='topButtonRow']/input[@name='resetPW']")
		public WebElement resetPassword;
	}

	@FindBy(css = "iframe")
	public Frame frame;
			
}
