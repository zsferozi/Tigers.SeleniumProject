package grouppractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

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
		
		List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println(month.size());
		
		for(int i=0 ; i<month.size();i++) {
			if(month.get(i).getText().equals("Sep")) {
				month.get(i).click();
				System.out.println(month.get(i).getText());
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
