package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.alaskaair.com/");
		driver.findElement(By.cssSelector("input[id='fromCity1']")).sendKeys("San Francisco, CA (SFO-San Francisco Intl.)");
		driver.findElement(By.cssSelector("input[id='toCity1']")).sendKeys("Boston, MA");
		driver.findElement(By.cssSelector("input[id='findFlights']")).click();
		driver.findElement(By.cssSelector("a[id='navAskJenn']")).click();
	}

}
