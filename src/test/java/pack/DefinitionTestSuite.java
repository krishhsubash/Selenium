package pack;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/LaunchBrowser.feature")
public class DefinitionTestSuite {
	
}
