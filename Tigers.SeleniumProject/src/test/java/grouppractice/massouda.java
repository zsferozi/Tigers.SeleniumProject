package grouppractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class massouda {

	public static void main(String[] args) {
//	
//			WebDriverManager.chromiumdriver().setup();
//			WebDriver driver = new ChromeDriver();
//
//			driver.get("https://www.facebook.com/");
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
//			driver.findElement(By.linkText("Create new account")).click();
//			
//			List<WebElement> year = driver.findElements(By.xpath("//select[@name='birthday_year']//option"));
//			//System.out.println(year.size());
//			
//			for(int i = 0; i<year.size();i++) {
//				if(year.get(i).getText().equals("1980")) {
//					System.out.println(year.get(i).getText());
//					break;
//				}
//			}
	   for(int i = 2010 ; i<=2020; i++) {
		System.out.println(i);
	}
		
		

	}

}
