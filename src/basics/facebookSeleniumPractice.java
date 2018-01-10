package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookSeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("TESTING");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("1234567");
		// <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" aria-required="1" placeholder="" aria-label="First name" id="u_0_e" aria-describedby="js_ap" aria-invalid="true">
		
		driver.findElement(By.cssSelector("input#u_0_e")).sendKeys("Thom");
	}

}
