package Mypackahe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.id("fromCity")).click();
		Thread.sleep(5000L);
		driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).click();
		driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys("MUM");
		Thread.sleep(2000L);
		driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000L);
		driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys(Keys.ENTER);
		Thread.sleep(2000L);
		WebElement Des=driver.findElement(By.id("toCity"));
		Des.click();
		Des.sendKeys("DE");
		Thread.sleep(2000L);
		Des.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000L);
		Des.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000L);
		Des.sendKeys(Keys.ENTER);
		
		/*
		WebElement source=driver.findElement(By.id("hp-widget__sfrom"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(2000L);
		source.sendKeys(Keys.ENTER);
		driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).clear();
		WebElement destination=driver.findElement(By.id("hp-widget__sTo"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000L);
		*/
	}

}
