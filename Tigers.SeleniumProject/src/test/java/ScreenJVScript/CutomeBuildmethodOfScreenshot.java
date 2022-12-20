package ScreenJVScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.Utils;

public class CutomeBuildmethodOfScreenshot extends Utils{

	public static void main(String[] args) {
	
		Utils.getBrowser("chrome","http://tek-school.com/retail/");
		TakeWebPageScreenshot ("Sanam");
		
		hardWait(5000);
		tearDown();
	// we use screenshot for validation of our test cases 	

	}
	
	//we create this customize method for screenshot and we call on it on line 17
	
	public static void TakeWebPageScreenshot(String screenshotName) {
		String path =".\\screenshots\\";
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// we should always surround line 33 in try&catch block to take care of any exceptions that will happen on the code
		try {
			FileUtils.copyFile(file, new File(path + screenshotName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
