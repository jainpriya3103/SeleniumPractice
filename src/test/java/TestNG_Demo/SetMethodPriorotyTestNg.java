package TestNG_Demo;

import org.testng.annotations.Test;

public class SetMethodPriorotyTestNg {
	public class TestNGPractice {
    // if we not give priority our methods will execute in alphabetical order
		@Test(priority=1)
		public void createContact() {
			System.out.println("contact created");

		}
		@Test(priority=0)
		public void updateContact() {
			System.out.println("contact updated");
		}
	    
		@Test(priority=2)
		public void deleteContact() {
			System.out.println("contact deleted");
		}
	}
}
