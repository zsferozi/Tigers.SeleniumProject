package MyOwnPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

import io.github.bonigarcia.wdm.WebDriverManager;
public class JSExcutor {

	public static void main(String[] args) {


 
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.get("https://shop.demoqa.com/");
        driver.findElement(By.cssSelector("a.noo-search")).click();
        hardWait();

 

        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("shirt");

        hardWait();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='form-control']"));
        
        js.executeScript("arguments[0].click;", searchBox);
        hardWait();

        driver.quit();

	}


    public static void hardWait() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
