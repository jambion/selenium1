package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java 1.8, Firefox 48+, Selenium 3.0
		// Need geckodriver
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.19.1-win64//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com"); // get to hit the website
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
