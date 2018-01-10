package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("Hi!!");
		// Search Bar XPATH: //div[@class='lst-c']/div/div[2]/div/input
		
		

	}

}
