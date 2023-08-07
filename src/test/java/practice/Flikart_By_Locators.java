package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.Filpkart;

public class Flikart_By_Locators {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\firefox\\geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Filpkart fk = new Filpkart(driver);
		fk.launchFilpKart();
		/*driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.partialLinkText("New to")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Shop Now'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='realme C33 2023 (Aqua Blue, 64 GB)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.quit();*/
		
	}

}
