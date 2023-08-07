package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto_Suggestion_Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("samsung");
		List <WebElement> allSuggestionList = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		Thread.sleep(1000);
		System.out.println(allSuggestionList.size());
		for (WebElement webElement : allSuggestionList) {
			
			if (webElement.getText().contains(" s22")) {
				Thread.sleep(1000);
				System.out.println(webElement.getText());
				webElement.click();
				break;
			}
			
			
			
		}
		
	}

}