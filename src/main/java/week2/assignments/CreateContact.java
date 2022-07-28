package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Salesian");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Francinath");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sals");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Franc");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Science");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Test@gmail.com");
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(state);
		dd.selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
	}

}
