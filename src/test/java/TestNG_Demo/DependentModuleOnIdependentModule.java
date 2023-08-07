package TestNG_Demo;

import org.testng.annotations.Test;

public class DependentModuleOnIdependentModule {

	//private static final String dependenton = null;

	@Test()
	public void createContact() {
		int a[] = {1,2,3};
		System.out.println(a[4]);
		System.out.println("contact created");

	}
	@Test(dependsOnMethods="createContact")
	public void updateContact() {
		System.out.println("contact updated");
	}
    
	@Test(dependsOnMethods="createContact")
	public void deleteContact() {
		System.out.println("contact deleted");
	}

}
