package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import baseFramework.baseClass;
import utilities.utilities;


public class testRadio1 extends baseClass{
	utilities util;

	@Test
	public void testradio() throws InterruptedException {
		//driver.findElement(By.linkText("No, thanks!")).click();

		util.clickElement(By.xpath(readProperty("inputForms")));
		//util.clickElement(By.xpath(readProperty("radioButton")));
		System.out.println(driver.getTitle());
	}

	/*@Test
	public void testdropdown() {
		util.clickElement(By.xpath(readProperty("inputForms")));
		util.clickElement(By.xpath(readProperty("selectDropdown")));
	}*/
	
}
