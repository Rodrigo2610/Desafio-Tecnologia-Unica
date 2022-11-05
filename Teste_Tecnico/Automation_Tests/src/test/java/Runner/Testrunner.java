package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import Data.TestData;
import Navegadores.Navegador;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/features/Web/",
 glue= {"steps_definition"},
 tags ={"@desafiotecnico"},
 plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
 monochrome = true
)

public class Testrunner implements TestData {
	
	@BeforeClass
	public static void setup() throws Exception { 
			
	}
	
    @AfterClass
    public static void writeExtentReport() {
      Reporter.loadXMLConfig(new File("config/report.xml"));
      Navegador.driver.close();
    }

}
