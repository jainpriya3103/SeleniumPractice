package svgElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GoogleSvgElement {

	public static void main(String[] args) throws FindFailed {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Screen s = new Screen();
		
		Pattern p = new Pattern("C:\\Users\\admin\\eclipse-workspace\\Qspider_Selenium\\icon.png");
		s.click(p);
		Pattern p1 = new Pattern("C:\\Users\\admin\\eclipse-workspace\\Qspider_Selenium\\meetIconGoogle.png");
		s.click(p1);
	}

}
