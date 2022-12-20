package ActionsVsAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExample {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html/26146");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
