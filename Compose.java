import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Compose {

    public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();

            // To maximize the window
            driver.manage().window().maximize();

            // driver.get() is used to navigate to url
            driver.get("https://accounts.google.com/signin");

            driver.findElement(By.id("identifierId")).sendKeys("test@gmai.com"); 
            
            driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();         

            //using implicit wait
            driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);   
            
            driver.findElement(By.id("password")).sendKeys("test@123");           

            driver.findElement(By.xpath("//div[@id='passwordNext']/div")).click(); 
            
          //Click on compose button
            driver.findElement(By.xpath("//div[@id=':l0']/div/div")).click();
            
          //Enter the sender mail id
    		driver.findElement(By.xpath("//div[@id=':qx']//input")).sendKeys("test12@gmail.com");
    		
    		//Enter subject to the mail
    		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Selenium script");
    		
    		//Attaching the file
    		 driver.findElement(By.id(":sa")).sendKeys("D:\\Automation Script\\PHPTRAVELS\\Hello.txt");
    		 
    		 //using implicit wait
             driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);  
    		 
    		 //Clicking on send button
    		 driver.findElement(By.id(":qi")).click();

            driver.close();
            
    }  

}