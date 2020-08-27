package customapis;


import java.io.IOException;
import java.net.URLEncoder;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
//import com.gargoylesoftware.htmlunit.javascript.host.Element;
//import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;*/

//import org.w3c.dom.NodeList;
//import org.w3c.dom.Element;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.*;


	@TestApi( title="Clear Cache Api"
				, summary=""
				, remarks=""
				, iconBase=""
				, defaultApiGroups={"My Test APIs"}
			)
	@TestApiParameterGroups(parameterGroups={
			@TestApiParameterGroup(groupName="inputs", title="Inputs"),
			@TestApiParameterGroup(groupName="result", title="Result"),
	})	

public class ClearCacheApi {	
    /** 
     * Used to write to the test execution log.
     */
    @TestLogger
    public Logger testLogger;
    
    /** 
     * Provides access to facilities, mainly to set and get variable values.
     */
    @TestExecutionContext
    public ITestExecutionContext testExecutionContext;
    
    @TestApiExecutor
    public Element execute() {
    	Element useless = null;
   		WebDriver driver= null;
    	try {
 
        	driver = new ChromeDriver();
        	Actions a = new Actions(driver);
        	
        //	a.sendKeys(Keys.chord(Keys.SHIFT, Keys.CONTROL, Keys.DELETE));

        	// Press SHIFT-CTRL-DELETE     
        	a.keyDown(Keys.SHIFT)
        	 .keyDown(Keys.CONTROL)
        	 .keyDown(Keys.DELETE)
        	 .build()
        	 .perform();
        	
        	   // Release SHIFT+CTRL keys   
        	   a.keyUp(Keys.CONTROL)
        	    .keyUp(Keys.SHIFT)
        	    .keyUp(Keys.DELETE)
        	    .build()
        	    .perform();
    		
    	}finally {
    	    if(driver!=null) {
    	        driver.quit();
    	    }
    	}
    	    	 
    	//return (Element) driver;
    	return useless;

        
    }
    
}
