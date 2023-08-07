package Pop_Ups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Agoda_Hotel_Booking {

	public static void main(String[] args) throws InterruptedException {
		String Key = "webdriver.chrome.driver";
		String Value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.agoda.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#textInput")).sendKeys("I");
		List <WebElement> citiesList = driver.findElements(By.xpath("//span[@class='Suggestion__text']"));
		for (WebElement city : citiesList) {
			if (city.getText().contains("Goa")) {
				System.out.println(city.getText());
				city.click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[@class='ab-close-button']")).click();
		driver.findElement(By.id("check-in-box")).click();
	//driver.findElement(By.xpath("//div[text()='May 2023']/ancestor::div[@class='DayPicker-Month']/descendant::span[.='30']")).click();
	//driver.findElement(By.xpath("//div[text()='June 2023']/ancestor::div[@class='DayPicker-Month']/descendant::span[.='3']")).click();
	driver.findElement(By.id("occupancy-box")).click();
	driver.findElement(By.xpath("//div[@class='sc-bdfBwQ sc-gsTCUz  ljntSB']")).click();
	driver.findElement(By.xpath("(//div[@data-element-name='occupancy-selector-panel-adult'])[2]")).click();
	driver.findElement(By.xpath("(//div[@data-element-name='occupancy-selector-panel-children'])[2]")).click();
	WebElement childAgeDD = driver.findElement(By.cssSelector(".DropdownInputUpdate__box"));
	Select sel = new Select(childAgeDD);
	sel.selectByValue("3");
	Thread.sleep(1000);
	driver.findElement(By.id("occupancy-box")).click();
	
	}

}
