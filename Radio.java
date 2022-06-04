package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
     
     driver.get("http://www.leafground.com/pages/radio.html");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@class='myradio' and @id='yes']")).click();
     driver.findElement(By.xpath("//input[@name='news' and @VALUE='0']")).click();
     driver.findElement(By.xpath("//input[@name='age' and @value='2']")).click();
     
     driver.close();
	}

}
