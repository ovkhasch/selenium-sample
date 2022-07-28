package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Oneplus Mobiles", Keys.ENTER);
		
		// Finding multiple elements on a single method
		List<WebElement> MobileNames = driver.findElements(By.xpath("//h2"));//ctrl+2;L
		for (WebElement webElement : MobileNames) { //Type - forEach and then + alt+Tab
			System.out.println(webElement.getText());
		}
		
	}

}
