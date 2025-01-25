package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ps{


		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();   
			driver.manage().window().maximize();     
			
			driver.get("https://id.manoramaonline.com/");
			/**
			 * Locators
			 * 1. By ID 
			 * 2. By name
			 * 3. By ClassName
			 * 4. By LinkText
			 * 5. By PartialLinkText
			 * 
			 */
			
			driver.findElement(By.id("emailOrMobile")).sendKeys("standard_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.className("btn ")).click();
			Thread.sleep(2000);
		/*	driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("About")).click();
			driver.navigate().back();
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
		*/	driver.findElement(By.partialLinkText("Logo")).click();
			
			driver.quit();

		}
	}




