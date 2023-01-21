package NxtGen_TestPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import NxtGen_Base.Base_Class;
import NxtGen_Locators.Demosites_Page;
import NxtGen_Locators.GettitlePage;


public class Register_Test_Functionality  extends Base_Class{
	
	GettitlePage titlepage;
	Demosites_Page demo;
	
	public Register_Test_Functionality() {
		PageFactory.initElements(driver, this);
		titlepage = new GettitlePage();
		demo = new Demosites_Page();
	}
	
	@Test(priority = 1)
	public void Validate_Titles() throws InterruptedException {
		titlepage.Validate_GetTitlePage();
		titlepage.validate_GetCurrentURL();
	}
	@Test(priority = 2)
	public void Validate_RegisterPage() throws InterruptedException {
		demo.validate_DemoandRegiter();
	}

	@BeforeClass
	public void openwindow() {
		Instalization();
	}
	@AfterClass
	public void closewindow() {
		Teardown();
	}
}
