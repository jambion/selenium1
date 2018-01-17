package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		//<img src="https://images.nike.com/is/image/DotCom/pwp_sheet2?$NIKE_PWPx3$&$img0=921664_001&$img1=921664_300&img2=921664_002">
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("dog food");
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		//<h2 data-attribute="Purina Dog Chow Natural Natural Made with Real Chicken and Beef Adult Dry Dog Food - (1) 16.5 lb. Bag" data-max-rows="4" class="a-size-base s-inline  s-access-title  a-text-normal">Purina Dog Chow Natural Natural Made with Real Chicken and Beef Adult Dry Dog Food - (1) 16.5 lb. Bag</h2>
		driver.findElement(By.cssSelector("h2[data-attribute='Purina Dog Chow Natural Natural Made with Real Chicken and Beef Adult Dry Dog Food - (1) 16.5 lb. Bag']")).click();
		
		
	}

}
