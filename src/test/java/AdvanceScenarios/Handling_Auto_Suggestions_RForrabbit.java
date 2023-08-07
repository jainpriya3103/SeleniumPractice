package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Auto_Suggestions_RForrabbit {

	public static void main(String[] args) throws InterruptedException {
		String Key = "webdriver.gecko.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\firefox\\geckodriver.exe";
		System.setProperty(Key, value);
        WebDriver driver = new FirefoxDriver ();
        driver.get("https://rforrabbit.com/");
        driver.findElement(By.name("q")).sendKeys("p");
       
        List <WebElement> allCyclesList = driver.findElements(By.xpath("//li[@class='autocomplete-item categories']"));
        Thread.sleep(1000);
        System.out.println(allCyclesList.size());
        for (WebElement webElement : allCyclesList) {
			System.out.println(webElement.getText());
		}
	}

}
