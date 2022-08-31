package Repository;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Hello");
		Thread.sleep(2000);

		List<WebElement> allLinks = driver.findElements(By.xpath("(//span[contains(text(),Hello)])"));
		int count = allLinks.size();

		for (int i = 0; i < count; i++) {
			String printLinks = allLinks.get(i).getText();
			System.out.println(printLinks);
		}
		driver.close();
	}

}
