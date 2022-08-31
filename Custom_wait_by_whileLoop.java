package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_wait_by_whileLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();

		while (true) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			} catch (Exception e) {

			}
		}
		driver.close();
	}
}