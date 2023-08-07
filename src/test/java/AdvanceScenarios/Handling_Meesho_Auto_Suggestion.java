package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Meesho_Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		String Key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(Key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("sa");
		Thread.sleep(1000);
		List <WebElement> allSuggetionList = driver.findElements(By.xpath("//p[contains(@class,'sc-eDvSVe bhfjpI sc')]"));
		
		System.out.println(allSuggetionList.size());
		Thread.sleep(1000);
		for (WebElement suggestionList : allSuggetionList) {
			if (suggestionList.getText().contains("sarees party wear")) {
				Thread.sleep(1000);
				System.out.println(suggestionList.getText());
				suggestionList.click();
				break;
				
			}
		}

	}

}
