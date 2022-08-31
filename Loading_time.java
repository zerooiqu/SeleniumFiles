package Repository;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loading_time {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	}

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try {	
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("page loaded within 3 seconds");
			System.out.println();
		}
		catch(org.openqa.selenium.TimeoutException e) {
			System.out.println("page not loaded within 3 seconds");
		}
}
}