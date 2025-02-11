package selenum.webdriver.scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class set {
	WebDriver driver = new EdgeDriver();
  @Test
  public void f() throws Exception {
	  String baseurl = "https://www.calculator.net/calorie-calculator.html";
	  driver.navigate().to(baseurl);
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("US Units")).click();
	  WebElement age = driver.findElement(ById.id("cage"));
	  age.clear();
	  age.sendKeys("50");
	  WebElement heightf = driver.findElement(By.name("cheightfeet"));
	  heightf.clear();
	  heightf.sendKeys("5");
	  WebElement heighti = driver.findElement(By.name("cheightinch"));
	  heighti.clear();
	  heighti.sendKeys("7");
	  WebElement weight = driver.findElement(By.id("cpound"));
	  weight.clear();
	  weight.sendKeys("121");
	  boolean gender = driver.findElement(By.id("csex1")).isSelected();
	  if(gender = true)
	  System.out.println("Male is selected");
	  WebElement act = driver.findElement(By.id("cactivity"));
	  act.click();
	  driver.findElement(By.xpath("//*[@id=\"cactivity\"]/option[6]")).click();
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[3]")).click();
	  Thread.sleep(3000);
	  driver.quit();
  }

}
