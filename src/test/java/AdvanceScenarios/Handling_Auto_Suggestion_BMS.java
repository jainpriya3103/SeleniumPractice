package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Auto_Suggestion_BMS {

	public static void main(String[] args) throws InterruptedException {
		String Key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(Key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("a");
		Thread.sleep(1000);
		List <WebElement> allCitiesList = driver.findElements(By.xpath("//li[@class='sc-gJqsIT cqsDXJ']"));
		System.out.println(allCitiesList.size());
       for (WebElement citiesList : allCitiesList) {
    	   if (citiesList.getText().contains("Bengaluru")) {
    		   Thread.sleep(1000);
    		   System.out.println(citiesList.getText());
    		   citiesList.click();
    		   break;
			
		}
		
	}
	}

}
