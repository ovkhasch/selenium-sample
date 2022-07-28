package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebDriverManager {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
//		System.out.println(System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe"));
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(source);
		dd.selectByVisibleText("Employee");
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd1=new Select(industry);
		dd1.selectByValue("IND_FINANCE");
		
		WebElement patnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd2=new Select(patnership);
		dd2.selectByIndex(2);
		
	}

}
	


