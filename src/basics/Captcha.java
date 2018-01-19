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
		int captchaNumber = findFrameNumber(driver, By.cssSelector("*[id='recaptcha-anchor'] div:nth-child(5)"));
		
		driver.switchTo().frame(captchaNumber);
		
		driver.findElement(By.cssSelector("*[id='recaptcha-anchor'] div:nth-child(5)")).click();
		
		driver.switchTo().defaultContent(); // Switch back to default landing page. Don't use if you are traversing to child frame(s)
		int verifyNumber = findFrameNumber(driver, By.cssSelector("*[id='recaptcha-anchor'] div:nth-child(5)"));

		
	}
	
	// Method to find the frame number
	public static int findFrameNumber(WebDriver driver, By by) {
		int i;
		int frameCount = driver.findElements(By.tagName("iframe")).size(); // Get count of frames
		
		System.out.println(frameCount);
		
		// Loop through all the frames and switch to that frame 
		// If the captcha element is found, break out of the loop and "int i" will be the selected frame
		for(i = 0; i < frameCount; i++) {
			driver.switchTo().frame(i);
			
			int count = driver.findElements(by).size();
			
			if(count > 0) {
				break;
			} else {
				System.out.println("Continue looping");
			}
		} 
		
		driver.switchTo().defaultContent(); // Go to the default landing page
		
		return i;

	}
	

}
 