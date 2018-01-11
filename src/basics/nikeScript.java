package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nikeScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://store.nike.com/us/en_us/pw/nikelab-shoes/ofoZoi3");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[text()='NikeLab Veil Gyakusou']")).click();
		
		//<input type="radio" id="skuAndSize__20823134:M 10 / W 11.5" name="skuAndSize" value="20823134:M 10 / W 11.5" aria-label="M 10 / W 11.5">
//		driver.findElement(By.xpath("//input[@id='skuAndSize__20823134:M 10 / W 11.5']")).click();
//		driver.findElement(By.cssSelector("id(\'buyTools\')/div[2]/button[1]")).click();
		// <p class="product-display-name nsg-font-family--base edf-font-size--regular nsg-text--dark-grey">Nike Air VaporMax Flyknit</p>
		//<img src="https://images.nike.com/is/image/DotCom/pwp_sheet2?$NIKE_PWPx3$&amp;$img0=904732_001">
		////*[@id="exp-gridwall-wrapper"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[7]/div/div/div[1]/div/a/img
		// <p class="product-display-name nsg-font-family--base edf-font-size--regular nsg-text--dark-grey">NikeLab Free RN Commuter 2017 Gyakusou</p>
		
		// Adding size 9.5 Free RN Commuter to cart from NikeLab page
		driver.findElement(By.xpath("//*[@id=\'exp-gridwall-wrapper\']/div[2]/div[2]/div[2]/div[1]/div[1]/div[7]/div/div/div[1]/div/a/img")).click();
		Thread.sleep(5000);

		// //*[@id="buyTools"]/div[1]/div/label[8]
		driver.findElement(By.xpath("//*[@id=\'buyTools\']/div[1]/div/label[8]")).click();
		
		// //*[@id="buyTools"]/div[2]/button[1]
		
		driver.findElement(By.xpath("//*[@id=\'buyTools\']/div[2]/button[1]")).click();
		
	}

}
