package Navegadores;

import java.io.File;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Data.TestData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegador implements TestData {

	public static ChromeOptions option;
	public static String jsonAsString;
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void Chrome(String args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		caps.setCapability("acceptInsecureCerts", true);
		driver = new ChromeDriver(caps);
		driver.get(args);
		driver.manage().window().maximize();
	}

}