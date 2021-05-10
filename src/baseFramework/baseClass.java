package baseFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class baseClass {

	public WebDriver driver;
	File f;
	FileInputStream fip;
	public Properties prop;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialconfig();
		System.setProperty("webdriver.chrome.driver",readProperty("chromedriverPath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(readProperty("applicationURL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	public void initialconfig() {
		System.out.println(System.getProperty("user.dir"));
		f= new File(System.getProperty("user.dir")+"\\src\\config\\config.properties");
		try {
			fip = new FileInputStream(f);
			prop = new Properties();
			prop.load(fip);
		} catch (FileNotFoundException e) {
			System.out.println("File Not found exception in config"+ e.getMessage());		
		} catch (IOException e) {
			System.out.println("File Not found exception in config"+ e.getMessage());	
		}
		
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
		driver.quit();
	}
	//Utility method for reading properties file
			public String readProperty(String key) {
				return prop.getProperty(key);
			}
	
}
