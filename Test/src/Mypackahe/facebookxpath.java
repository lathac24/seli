package Mypackahe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
       /* driver.findElement(By.xpath("//input[@type='email']")).sendKeys("My own Xpath");  -Xpath
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
        
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my own css");
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        

	}

}
