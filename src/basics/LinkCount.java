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
	
		// Get total number of links for the second column of the footer section
		
		WebElement secondFooterColumn = driver.findElement(By.cssSelector("div[id='gf-BIG'] table tbody tr td:nth-child(2)"));
		int linkCount = secondFooterColumn.findElements(By.tagName("a")).size();
		System.out.println(linkCount);
		for(int i = 0; i < linkCount; i++) {
			System.out.println(secondFooterColumn.findElements(By.tagName("a")).get(i).getAttribute("textContent"));
		}
		String beforeClick = driver.getTitle();
		System.out.println("Title before click: " + beforeClick);
		// Click last link of the footer's second column (Window size must be increased to reveal link)
		driver.findElement(By.cssSelector("div[id='gf-BIG'] table tbody tr td:nth-child(2) ul li:last-child a")).click();
		String afterClick = driver.getTitle();
		System.out.println("Title after click: " + afterClick);
		if(beforeClick != afterClick) {
			if(afterClick.contains("Sitemap")) {
				System.out.println("PASS");
			}
			
		} else {
			System.out.println("FAIL");
		}
	}

}
