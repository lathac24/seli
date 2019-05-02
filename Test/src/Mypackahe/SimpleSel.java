package Mypackahe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.className("inputtext")).sendKeys("hello world");
        //driver.findElement(By.className(className("inputtext")).sendKeys("hello world");
       // driver.findElement(By.id("email")).sendKeys("This is my first code");
        //driver.findElement(By.name("pass")).sendKeys("12345");
        //driver.findElement(By.linkText("Forgot account?")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("email id");
       // driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div")).click();
        }

}
