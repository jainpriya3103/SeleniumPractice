package MockAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HandleBBAutoSuggestion {
@Test
	public  void m1() throws IOException, InterruptedException {
		String Key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(Key, value);
		WebDriver driver = new ChromeDriver();
		FileInputStream fip = new FileInputStream(".\\CommonData.properties");
		Properties pobj = new Properties();
		pobj.load(fip);
		String URL = pobj.getProperty("url");
		int i = 1;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products..']")).sendKeys("apple");
		List<WebElement> autoSuggestionList = driver.findElements(By.xpath("//li[@qa='prodListAS']"));
		for (WebElement suggestion : autoSuggestionList) {
			String suggestionValue = suggestion.getText();
			System.out.println(suggestionValue+ " " + i++);
			if(suggestion.getText().contains(" - Red Delicious, Regular"))
			{ 
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//p[contains(text(),'- Red Delicious, Regular')])[1]")).click();
				break;
			}
		}
		Thread.sleep(2000);
		String appleName = driver.findElement(By.xpath("//div[contains(@class,'zXTz')]/div[3]/descendant::a[.='Fresho Apple - Royal Gala, Regular']")).getText();
		System.out.println("name of the apple is " +appleName);
		String applePrice = driver.findElement(By.xpath("//div[contains(@class,'zXTz')]/div[3]/descendant::div[4]/descendant::span[contains(@class,'pIU')]")).getText();
        System.out.println("price of apple is " +applePrice);
	}

}
