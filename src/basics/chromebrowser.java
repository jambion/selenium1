package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com"); // URL in the browser
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("YoGabbaGabba");
		driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("LITT");
//		driver.findElement(By.className("inputtext")).sendKeys("foo@bar.com");
//		driver.findElement(By.name("pass")).sendKeys("password12345");
//		driver.findElement(By.linkText("Forgot account?")).click();

		//		System.out.println(driver.getPageSource());
//		driver.close();
	}

}
