package AdvanceScenarios;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_Multiple_Elements_Amazon {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		int count = 0;
		int i = 1;
		driver.get("https://www.amazon.in/");
		List <WebElement> allImageSrc=driver.findElements(By.xpath("//img"));
		for (WebElement webElement : allImageSrc) {
			System.out.println(i++ + "" + webElement.getAttribute("src"));
			count++;
		}
      System.out.println("total no of images "+count);
	}

}
