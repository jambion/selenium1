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
//		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("YoGabbaGabba");
//		driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("LITT");
		
		// CUSTOM XPATH 
		
		// Email: <input type="email" class="inputtext" name="email" id="email" value="djuicea1@hotmail.com" tabindex="1" data-testid="royal_email">
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("TestEmail@yahoo.com");
		
		// Password: <input type="password" class="inputtext" name="pass" id="pass" tabindex="2" data-testid="royal_pass">
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("PASSWORD");
		
		// Login Button
		// <input value="Log In" tabindex="4" data-testid="royal_login_button" type="submit" id="u_0_3">
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		// Recover: <a class="_42ft _4jy0 _62c3 _4jy4 _517h _51sy" role="button" href="https://www.facebook.com/recover/initiate?lwv=120&amp;lwc=1348092">Recover Your Account</a>
		System.out.println(driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _62c3 _4jy4 _517h _51sy']")).getText());
		
		//		driver.findElement(By.className("inputtext")).sendKeys("foo@bar.com");
//		driver.findElement(By.name("pass")).sendKeys("password12345");
//		driver.findElement(By.linkText("Forgot account?")).click();

		//		System.out.println(driver.getPageSource());
//		driver.close();
	}

}
