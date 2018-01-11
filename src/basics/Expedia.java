package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Expedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.expedia.com");
		// <select id="package-1-adults-hp-package" class="num-adults gcw-storeable" autocomplete="off" data-gcw-storeable-name="gcw-num-adults-1">

		Select s = new Select(driver.findElement(By.cssSelector("select[id='package-1-adults-hp-package']")));
		s.selectByValue("5");
		s.selectByIndex(5);
	}

}
