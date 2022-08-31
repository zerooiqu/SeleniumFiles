package Repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_searchs {

	static {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("hello");
		Thread.sleep(5000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//span[contains(text(),'ello')]"));
		int count = allLinks.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String printLink = allLinks.get(i).getText();
			System.out.println(printLink);
		}
		allLinks.get(0).click();

		driver.close();
	}
}