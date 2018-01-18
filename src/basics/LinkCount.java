package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com");
		
		// Count all of the links in the page 
		System.out.println("Total links on the entire webpage");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Count of links in the footer section 
		WebElement footer = driver.findElement(By.id("hlGlobalFooter"));
		System.out.println("Total links in the footer section: ");
		System.out.println(footer.findElements(By.tagName("a")).size());
	}

}
