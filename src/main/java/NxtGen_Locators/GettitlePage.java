package NxtGen_Locators;

import org.openqa.selenium.support.PageFactory;

import NxtGen_Base.Base_Class;

public class GettitlePage extends Base_Class {

	public GettitlePage() {
		PageFactory.initElements(driver, this);

	}

	public void Validate_GetTitlePage() {
		String title = "NxtGen A.I Academy – Automate Intelligently";
		if(driver.getTitle().equals(title)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		String text = driver.getTitle();
		System.out.println(text);
	}

	public void validate_GetCurrentURL() {
		String title = "https://nxtgenaiacademy.com/";
		if(driver.getTitle().equals(title)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		String text = driver.getCurrentUrl();
		System.out.println(text);
	}


}
