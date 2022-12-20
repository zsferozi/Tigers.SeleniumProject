package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CVSLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cvs.com/account/login");
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	
   	driver.findElement(By.id("emailField")).sendKeys("Zahal@gmail.com");
	
		driver.findElement(By.xpath("//button[@class='continue-button primary']")).click();
		
		driver.close();
		driver.quit();
		

	}

}
