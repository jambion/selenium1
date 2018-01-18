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
		String firstMonth = driver.findElement(By.cssSelector("div[class='datepicker-cal-month'] table caption")).getAttribute("textContent");
		System.out.println(firstMonth);
		
		while(!firstMonth.equals("Jul 2018")) {
			driver.findElement(By.cssSelector("button[type='button'][class='datepicker-paging datepicker-next btn-paging btn-secondary next']")).click();
			firstMonth = driver.findElement(By.cssSelector("div[class='datepicker-cal-month'] table caption")).getAttribute("textContent");
			System.out.println(firstMonth);

		}
		
		List<WebElement> dates = driver.findElements(By.className("datepicker-cal-date"));
		int calendarSize = dates.size();
		System.out.println(calendarSize);
		
		for(int i = 0; i < calendarSize; i++) {
			String day = dates.get(i).getAttribute("textContent");
			System.out.println(day);
			if(day.equalsIgnoreCase("7")) {
				dates.get(i).click();
				break;
			}
		}
		
	}

}
