package cucumberOptions;



import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/java/features",
	
	glue= "stepDefinations",tags="@PortalTest",
	plugin= {"pretty","html:target2/cucumber","json:target2/cucumber.json","junit:target2/cukes.xml"})
	
			
	public class TestRunner {
		



	}
	


