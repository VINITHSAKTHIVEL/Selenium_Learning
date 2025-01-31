package selenum.webdriver.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class inout {

	public static void main(String[] args) {
		
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com/");
System.out.println("Test Passed");
System.out.println(driver);
WebElement searchBox = driver.findElement(By.name("q"));
searchBox.sendKeys("japan");
searchBox.sendKeys(Keys.RETURN);
System.out.println("Page Title: " + driver.getTitle());
driver.quit();
	}

}
