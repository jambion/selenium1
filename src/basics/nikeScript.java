package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nikeScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nike.com/t/air-vapormax-flyknit-utility-unisex-running-shoe-XPTbVZzp");
		
		
		//<input type="radio" id="skuAndSize__20823134:M 10 / W 11.5" name="skuAndSize" value="20823134:M 10 / W 11.5" aria-label="M 10 / W 11.5">
		driver.findElement(By.xpath("//input[@id='skuAndSize__20823134:M 10 / W 11.5']")).click();
	}

}
