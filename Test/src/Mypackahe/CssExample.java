package Mypackahe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*xpath=//tagname[@attribute='value']
				css=tagname[attribute='value']*/
		System.setProperty("webdriver.chrome.driver", "C:\\selenium java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("latha");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
