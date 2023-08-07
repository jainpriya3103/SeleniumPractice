package svgElement;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class OpenSearchAndPaint {

	public static void main(String[] args) throws FindFailed {
		Screen s = new Screen();
		Pattern p = new Pattern("C:\\Users\\admin\\eclipse-workspace\\Qspider_Selenium\\minimizeIconEclipse.png");
        s.click(p);
        Pattern p1 = new Pattern("C:\\Users\\admin\\eclipse-workspace\\Qspider_Selenium\\searchIcon.png");
        s.click(p1);
        Pattern p2 = new Pattern("C:\\Users\\admin\\eclipse-workspace\\Qspider_Selenium\\searchIconWindow.png");
       s.type(p1,"paint");
	}

}
