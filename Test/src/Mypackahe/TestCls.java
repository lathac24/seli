package Mypackahe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCls {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");//hit url on the browser
		System.out.println(driver.getTitle());//validate if ur page title is correct
		System.out.println(driver.getCurrentUrl());//validate you are landed on correct url
		driver.getPageSource();//print pagesource
		driver.navigate().to("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.close();//it closes current browser
		//driver.quit();//it will closes all the  browsers opened by selenium script
		
		
	}

}
