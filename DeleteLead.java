package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DeleteLead {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Phone")).click();
		
		Thread.sleep(5000);
		
		String ram=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId' and @id='ext-gen858']")).getText();
				
		System.out.println(ram);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId' and @id='ext-gen858']")).click();
		
		driver.findElement(By.xpath("//a[@class-'subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("LeadId");
		
		driver.findElement(By.xpath("//button[text()='find Leads']")).click();
		
		if(driver.getTitle().contains("Testleaf"))
		{
			System.out.println("The title is verified");
		}
		else
		{
			System.out.println("No records to display");
		}
		
		Thread.sleep(5000);
		
		driver.close();
		}
	}


