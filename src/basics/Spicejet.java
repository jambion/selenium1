package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
		// table[id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td/input
		driver.findElement(By.cssSelector("table[id='ctl00_mainContent_rbtnl_Trip']>tbody>tr>td:nth-of-type(2)>input")).click();
		
	}

}
