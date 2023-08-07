package Pop_Ups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authentication_PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		// for auth pop up we need to pass cradentials in url only
		//syntax http://username:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
