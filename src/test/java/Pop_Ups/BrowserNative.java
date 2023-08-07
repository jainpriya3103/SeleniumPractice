package Pop_Ups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserNative {

	public static void main(String[] args) {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("InPrivate");
		WebDriver driver = new EdgeDriver(option);
		driver.manage().window().maximize();

	}

}
