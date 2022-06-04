package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Divya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("T");
		driver.findElement(By.xpath("//input[@name='reg_email_']")).sendKeys("divya.smile1234");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("divya12");
		 
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select ram = new Select(ele1);
		ram.selectByValue("12");
		 
		WebElement ele2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select rrr = new Select(ele2);
		rrr.selectByVisibleText("Feb");
		
		WebElement ele3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select rar = new Select(ele3);
		rar.selectByValue("1992");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
	}

}
