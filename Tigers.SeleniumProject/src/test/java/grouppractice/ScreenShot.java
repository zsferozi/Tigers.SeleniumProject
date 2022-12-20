package grouppractice;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/feed/");
		String screenshotName = "LinkedIn";

		String path = ".\\Screenshots\\";
		Date crurrentdate = new Date();
		String screenshotfilename = crurrentdate.toString().replace(" ", "-").replace(";", "-");
		
		//System.out.println(screenshotfilename);
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File(path + screenshotfilename + ".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
