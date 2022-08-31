package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait_by_int {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();

		int i = 0;
		while (i < 100) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			} catch (Exception e) {
              i++;
			}
		}
		System.out.println(i);
		driver.close();
	}
}