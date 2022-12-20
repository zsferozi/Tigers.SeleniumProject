package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Executor {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/retail/");

		driver.manage().window().maximize();
		//flash
		WebElement cart = driver.findElement(By.xpath("//input[@name='search']"));
		JsUtils.flash(cart, driver);
		
		
		
		
		
		
		driver.close();
		driver.quit();
		
		
		
		
		
	}

}
