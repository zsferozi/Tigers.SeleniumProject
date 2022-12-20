package grouppractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshortMethod {
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		takePicture("Zahal");
		driver.quit();

	}
    public static void takePicture(String fileName) {
    	//1. take screenshot and store it as a file name
    	//TakesScreenshot is an interface we are type cast it to driver
    	//File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	TakesScreenshot ts= ((TakesScreenshot)driver);
    	File file =ts.getScreenshotAs(OutputType.FILE);
    	//2 now copy the screenshot to desire location using copyfile method
    	try {
			FileUtils.copyFile(file, new File(".\\ScreenShots2\\"+fileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
