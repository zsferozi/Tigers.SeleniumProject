package afterclasspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class FindElementsPractice extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "https://www.facebook.com/");
		
        driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();
        
        List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
        
        for(int i = 0; i<months.size(); i++) {
        	if(months.get(i).getText().contains("Nov")) {
        		System.out.println(months.get(i).getText());
        		months.get(i).click();
        	}
        	
        }
        hardWait(3000);
        tearDown();
		

	}

}
