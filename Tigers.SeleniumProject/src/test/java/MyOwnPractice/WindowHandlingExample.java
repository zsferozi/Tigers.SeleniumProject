package MyOwnPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import utilities.Utils;

public class WindowHandlingExample extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "https://opensource-demo.orangehrmlive.com/"); // this is parent windows
		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click(); //1st child window

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(); //2nd child window

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();  //3rd child window

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();  //4th childwindow

		Set<String> handles = driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(handles);
		if (switchToTheRightWindow("Facebook", hlist)) {
			System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
		}
		closeAllWindows(hlist, parentWindowId);

		switchToParentWindow(parentWindowId);
		System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());

	}

	public static void closeAllWindows(List<String> hlist, String parentWindowId) {
		for (String e : hlist) {
			if (!e.equals(parentWindowId)) {
				driver.switchTo().window(e).close();

			}
		}

	}

	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);

	}

	public static boolean switchToTheRightWindow(String windowTitle, List<String> hlist) {

		for (String e : hlist) {
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("found the right window.....");
				return true;
			}

		}
		return false;

	}

}
