package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Get_Text_From_Amazon {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchField = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchField.sendKeys("samsung mobile");
		searchField.submit();
		Thread.sleep(1000);
		WebElement priceElement = driver.findElement(By.xpath("//span[text()='Samsung Galaxy M32 Prime Edition (Black, 6GB RAM, 128GB)']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::div[8]"));
		System.out.println(priceElement.getText());
	}

}
