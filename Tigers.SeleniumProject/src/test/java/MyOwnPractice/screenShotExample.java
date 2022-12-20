package MyOwnPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.Utils;

public class screenShotExample extends Utils{

	public static void main(String[] args) {
		
		
		getBrowser("edge", "https://www.yahoo.com/");
		
		String screenshots = "yahoo";
		
		String path = ".\\ScreenShots2\\";
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file,  new File(path + screenshots + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		hardWait(5000);
		tearDown();
		

	}

}
