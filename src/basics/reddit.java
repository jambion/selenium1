package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reddit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.reddit.com");
		
		driver.findElement(By.cssSelector("input[name*='user']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[contains(@placeholder,'sear')]")).sendKeys("Dogs");

		driver.findElement(By.xpath("//button[contains(@class,'bt')]")).click();
	}

}
