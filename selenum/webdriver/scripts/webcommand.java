package selenum.webdriver.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.*;
public class webcommand {

public static void main(String[] args) {
	
WebDriver driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");
String currHandle=driver.getWindowHandle();
System.out.println("current handle "+currHandle);
driver.findElement(By.linkText("Open new window")).click();
System.out.println(driver.getTitle());
Object[] windowHandles=driver.getWindowHandles().toArray();
driver.switchTo().window((String) windowHandles[1]);
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window((String) windowHandles[0]);
System.out.println(driver.getTitle()+" after close");
driver.switchTo().newWindow(WindowType.TAB);
System.out.println(driver.getTitle());
driver.switchTo().newWindow(WindowType.WINDOW);
System.out.println("new window"+driver.getTitle());
driver.quit(); 


	}

}

