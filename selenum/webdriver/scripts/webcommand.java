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

//fetch handle of this

String currHandle=driver.getWindowHandle();

System.out.println("current handle "+currHandle);

//click on link to open a new window

driver.findElement(By.linkText("Open new window")).click();

System.out.println(driver.getTitle());

//fetch handles of all windows, there will be two, [0] default, [1] new window

Object[] windowHandles=driver.getWindowHandles().toArray();

driver.switchTo().window((String) windowHandles[1]);

///////////////////assert on title of new window

System.out.println(driver.getTitle());



////////////////System.out.println("new window" driver.getTitle());

driver.close();
//Switch back to the old tab or window

driver.switchTo().window((String) windowHandles[0]);

System.out.println(driver.getTitle()+" after close");

//Opens a new tab and switches to new tab

driver.switchTo().newWindow(WindowType.TAB);

System.out.println(driver.getTitle());

//assertEquals("", driver.getTitle());

//Opens a new window and switches to new window

driver.switchTo().newWindow(WindowType.WINDOW);

//assertEquals("", driver.getTitle());
System.out.println("new window"+driver.getTitle());
//quitting driver

driver.quit(); //close all windows

	
		
		
		
		
		
		
		
		
	}

}
