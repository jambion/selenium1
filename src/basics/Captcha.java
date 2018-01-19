package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		switchToFrame(driver);
		driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
	}
	
	// Method to handle frames
	public static void switchToFrame(WebDriver driver) {
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frameCount);
		for(int i = 0; i < frameCount; i++) {
			driver.switchTo().frame(i);
		}

	}
	

}
