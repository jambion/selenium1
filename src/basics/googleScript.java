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
		
//		driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("Hi!!");
		// Search Bar XPATH: //div[@class='lst-c']/div/div[2]/div/input
		////*[@id="gbw"]/div/div/div[1]/div[3]/a
//		driver.findElement(By.xpath("//a[@data-pid='2']")).click();
//		driver.findElement(By.cssSelector("a[data-pid='23']")).click();
		driver.findElement(By.xpath("//div[@id='gb']/div[2]/div/div/div/div[1]/a")).click();
		
		

	}

}
