package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class travelCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		driver.findElement(By.id("package-departing-hp-package")).click();
		
		List<WebElement> dates = driver.findElements(By.className("datepicker-cal-date"));
		int calendarSize = dates.size();
		System.out.println(calendarSize);
		
		
		
	}

}
