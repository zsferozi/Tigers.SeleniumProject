package MyOwnPractice;

import utilities.Utils;

public class EnterKey extends Utils {
	public static void main(String[] args) {
		
		 Utils.getBrowser("chrome","https://www.facebook.com/");
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.navigate().to("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Utils.hardWait(2000);
		driver.navigate().forward();
		Utils.hardWait(3000);
		driver.navigate().back();
		driver.getCurrentUrl();
		
		driver.manage().window().maximize();
		
		driver.close();
		driver.quit();
	}

}
