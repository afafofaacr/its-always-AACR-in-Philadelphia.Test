package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="lst__relatedListAuraAppEventListener"                                
               , summary=""
               , connection="LP_UAT"
               , object=""
     )             
public class lst__relatedListAuraAppEventListener {

	@LinkType()
	@FindBy(xpath = "(//a[contains(normalize-space(.),'Subscriptions'))[0]")
	public WebElement subscriptions;
	
}
