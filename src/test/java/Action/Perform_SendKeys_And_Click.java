package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_SendKeys_And_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver = new EdgeDriver();
				driver.get("https://demo.actitime.com/login.do");
			WebElement userName =	driver.findElement(By.id("username"));
			WebElement password = 	driver.findElement(By.name("pwd"));
		    WebElement loginButton =	driver.findElement(By.cssSelector("#loginButton"));
			Actions act = new Actions(driver);
			//one approach
			/*act.sendKeys(userName, "admin").perform();
			act.sendKeys(password, "manager").perform();*/
			//second approach(to perform multiple operation in single line we use build)
			act.sendKeys(userName, "admin").sendKeys(password, "manager").sendKeys(loginButton).build().perform();

	}

}
