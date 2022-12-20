package grouppractice;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotMethod {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/");
		TakeWebPageScreenshot();
		
		driver.quit();

	}

	// we create this customize method for screenshot and we call on it on line 17
	public static void TakeWebPageScreenshot() throws IOException {
		String path = "\\Tigers.SeleniumProject\\ScreenShots2\\";
		String screenShots = "Tek- ScreenShot";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// we should always surround line 33 in try&catch block to take care of any
		// exceptions that will happen on the code
	     try {
			FileUtils.copyFile(file, new File(path + screenShots + ".png"));
	     }catch (Exception e) {
	    	 e.printStackTrace();
	    	 
	     }
	

//	// method for taking screenshots
//			public static void takeScreenShot(String screenShots) throws IOException {
//				// we need to create a folder at project level and store the path here so that
//				// when even we take screenshots, they are all saved in that specific folder
//				String path = ".\\screenshots\\";
//				// I create object of the file class
//				File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//				// After taking the screenshot, take the file and store it in a location in my
//				// computer
//				// and also I want to provide the file_name and the extension
//				try {
//					FileUtils.copyFile(file, new File(path + screenShots + ".png"));
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//
//}

//	public static void TakeWebPageScreenshot(String screenshotName) {
//
//		String screenShots = "Tek- ScreenShot";
//
//		String path = ".\\ScreenShots2\\";
//
//		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(file, new File(path + screenShots + ".png"));
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//	}
	
	}
}
