package grouppractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDwonTwo {
	public static void main(String[] args) {
	WebDriverManager.chromiumdriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nora");
	hardWait();
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("MohammadZai");
	
	List<WebElement> day= driver.findElements(By.cssSelector("select#day>option"));
	System.out.println(day.size());
	for(int j= 0; j<day.size();j++) {
		if(day.get(j).getText().equals("15")) {
		day.get(j).click();
		System.out.println(day.get(j).getText());
		break;
		}
		
	}
	hardWait();
	List<WebElement> year = driver.findElements(By.xpath("//select[@name='birthday_year']//option"));
	System.out.println(year.size());
	for(int i= 0;i<year.size();i++) {
		
		if(year.get(i).getText().equals("1980")) {
	
			year.get(i).click();
			System.out.println(year.get(i).getText());
			break;
			
		}
	}
	
	

}

public static void hardWait() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

}
