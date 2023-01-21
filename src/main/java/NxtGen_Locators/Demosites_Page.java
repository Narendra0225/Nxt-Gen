package NxtGen_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import NxtGen_Base.Base_Class;

public class Demosites_Page extends Base_Class {


	By demo = By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a");
	By practice = By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/a");
	By register = By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[1]/a");
	By alretclick = By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[2]/a");
	By multiwindow = By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[3]/a");
	By webtable = By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[4]/a");
	By iframes = By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[5]/a");

	public Demosites_Page() {
		PageFactory.initElements(driver, this);
	}
	//Click Register page
	public void validate_DemoandRegiter() throws InterruptedException {
		WebElement demo1 = driver.findElement(demo);
		WebElement demo2 = driver.findElement(practice);
		WebElement demo3 = driver.findElement(register);
		Actions mouse = new Actions(driver);
		mouse
		.moveToElement(demo1)
		.moveToElement(demo2)
		.moveToElement(demo3)
		.click()
		.perform();
		Thread.sleep(3000);

	}
	//	Alert click
	public void validate_DemoandAlert() throws InterruptedException {
		WebElement demo1 = driver.findElement(demo);
		WebElement demo2 = driver.findElement(practice);
		WebElement demo3 = driver.findElement(alretclick);
		Actions mouse = new Actions(driver);
		mouse
		.moveToElement(demo1)
		.moveToElement(demo2)
		.moveToElement(demo3)
		.click()
		.perform();
		Thread.sleep(3000);
	}
	//	Multi window
	public void validate_DemoandWindow() throws InterruptedException {
		WebElement demo1 = driver.findElement(demo);
		WebElement demo2 = driver.findElement(practice);
		WebElement demo3 = driver.findElement(multiwindow);
		Actions mouse = new Actions(driver);
		mouse
		.moveToElement(demo1)
		.moveToElement(demo2)
		.moveToElement(demo3)
		.click()
		.perform();
		Thread.sleep(3000);
	}
	//	webtable
	public void validate_Demoandwebtable() throws InterruptedException {
		WebElement demo1 = driver.findElement(demo);
		WebElement demo2 = driver.findElement(practice);
		WebElement demo3 = driver.findElement(webtable);
		Actions mouse = new Actions(driver);
		mouse
		.moveToElement(demo1)
		.moveToElement(demo2)
		.moveToElement(demo3)
		.click()
		.perform();
		Thread.sleep(3000);
	}
	//	iframes
	public void validate_Demoandiframes() throws InterruptedException {
		WebElement demo1 = driver.findElement(demo);
		WebElement demo2 = driver.findElement(practice);
		WebElement demo3 = driver.findElement(iframes);
		Actions mouse = new Actions(driver);
		mouse
		.moveToElement(demo1)
		.moveToElement(demo2)
		.moveToElement(demo3)
		.click()
		.perform();
		Thread.sleep(3000);

	}

}





