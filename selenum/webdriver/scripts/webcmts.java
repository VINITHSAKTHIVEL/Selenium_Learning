package selenum.webdriver.scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class webcmts {

	public static void main(String[] args) {
		String baseurl="https://www.calculator.net";
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl+"/age-calculator.html");
		driver.manage().window().maximize();//maximize window;
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl+ "  ...is the current url. \n The length is: "+ CurrentUrl.length());
		if(CurrentUrl.equals(baseurl))
		{
		System.out.println("Verification Successfull- The correct url is opened.");
		}
		else {
		System.out.println("Verification Failed - An incorrct url is opened.");
		System.out.println("Actual url is: " + CurrentUrl);
		System.out.println("Expected url is : " + baseurl);
		}
		try
		{
		Thread.sleep(7000);
		} catch (InterruptedException e)
		{
		e.printStackTrace();
		}
		System.out.println("age calculator");
		driver.navigate().to("http://www.calculator.net/time-calculator.html");
		driver.get("http://www.calculator.net/time-calculator.html");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page reloaded");
		String title=driver.getTitle();
		System.out.println("Page Title:"+ title);
		String expTitle="Time-Calculator";
		System.out.println(title);
		if(title.contentEquals(expTitle))
		System.out.println("Test Passed");
		else
		System.out.println("Test Failed");
		int titleLn=driver.getTitle().length();
		System.out.println("Title length is: "+titleLn);
		System.out.println(driver.getPageSource().length());
		driver.quit();

	}

}
