package NxtGen_Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver driver;
	public static Properties prop;

	public Base_Class() {
		try {
			prop = new Properties();
			FileInputStream Narendra = new FileInputStream("./Config/Config.Properties");
			prop.load(Narendra);
			Narendra.close();
		}catch (Exception e) {
			System.out.println("The exception is taken is :"+e.getMessage());

		}


	}
	public void Instalization() {
		String browsername = prop.getProperty("Browser");
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("The browser is open");
		}else {
			System.out.println("The browser is not open");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
		System.out.println("The browser is open as "+driver.getClass());

	}
	public void Teardown() {
		driver.close();
		System.out.println("The window is closed"+ driver.getClass());
	}

}
