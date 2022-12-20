package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class TestInta extends Utils{

	public static void main(String[] args) {
		
		 Utils.getBrowser("edge", "https://www.netflix.com/");
		 WebElement userName = driver.findElement(By.name("username"));
		 userName.sendKeys("aferozi@gmail.com");
		
		
		
		
    
		// Utils.getBrowser("edge", "https://www.instagram.com");
		
		// WebElement name = driver.findElement(By.name("username"));
		// name.sendKeys("Zahal mohammadzai Ferozi");
		
		// WebElement pass = driver.findElement(By.name("password"));
		// pass.sendKeys("Adam@2012");
		
	}

}
