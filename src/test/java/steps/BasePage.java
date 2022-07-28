package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void launch() {
		
		// driver setup
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
