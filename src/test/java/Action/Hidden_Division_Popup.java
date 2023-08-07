package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup {

	public static void main(String[] args) {
		String Key = "webdriver.chrome.driver";
		String Value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("(//span[.='Customer'])[2]/ancestor::tr[1]/descendant::div[@class='checkbox inactive']")).click();
		driver.findElement(By.xpath("//div[@class='bulkOperationsPanel']/descendant::div[.='Delete']")).click();

	}

}
