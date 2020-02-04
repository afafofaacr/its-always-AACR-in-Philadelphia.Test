package customapis;


import java.io.IOException;
import java.net.URLEncoder;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
//import com.gargoylesoftware.htmlunit.javascript.host.Element;
//import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/*import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;*/

//import org.w3c.dom.NodeList;
//import org.w3c.dom.Element;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.*;

@TestApi( title="Fonteva Frame Api"
        , summary=""
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"My Test APIs"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class FontevaFrameApi {
    
    @TestApiParameter(seq=1, 
            summary="The first parameter's summary.",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public String param1;
    
    @TestApiParameter(seq=2, 
            summary="The second parameter's summary.",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public boolean param2;

    @TestApiParameter(seq=10, 
            summary="The name that the result will be stored under.",
            remarks="",
            mandatory=true,
            parameterGroup="result")
    public String resultName;

    @TestApiParameter(seq=11, 
            summary="The lifespan of the result.",
            remarks="",
            mandatory=true,
            parameterGroup="result",
            defaultValue="Test")
    public ValueScope resultScope;

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

    	// Put our implementation logic here.
    	testLogger.info("Hello from " + this.getClass().getName());
    	
    	Document doc = null;
		try {
			doc = Jsoup.connect("http://en.wikipedia.org/").get();
		   	Element cardNum = doc.getElementById("card_number");
		   	return cardNum;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//Element newsHeadlines = doc.select("#mp-itn b a");
		return doc;
 
    	
    	/*String searchQuery = "card_number" ;
		
    	WebClient client = new WebClient();
    	client.getOptions().setCssEnabled(false);
    	client.getOptions().setJavaScriptEnabled(false);
    	try {
    	  String searchUrl = "https://newyork.craigslist.org/search/sss?sort=rel&query=" + URLEncoder.encode(searchQuery, "UTF-8");
    	  HtmlPage page = client.getPage(searchUrl);
    	}catch(Exception e){
    	  e.printStackTrace();
    	}
    	}*/

       /* // Store the result (if appropriate).
    	String dummyResult = this.getClass().getName() + " result";
        testExecutionContext.setValue(resultName, dummyResult, resultScope);*/
        
    }
    
}
