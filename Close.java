package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://acme-test.uipath.com");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
       driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
       System.out.println(driver.getTitle());
       driver.findElement(By.xpath("//form[@id='logout-form']/following-sibling::li/a")).click();
       driver.close();
	}
}
