package Partner_Onboarding.Partner_Onboarding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
    WebDriver driver;

    public LoginPage(WebDriver driver) 
    {
        this.driver = driver;
    }

    public void login() throws InterruptedException
    {
        driver.get("http://65.0.79.228:4200/");
        
        // Log-in as Asego User
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("patel.hardik@asego.in");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
        Thread.sleep(3000);
    }
    public void loginApprove()
    {
    	 driver.get("http://65.0.79.228:4200/");
         
         // Log-in for Approval
         driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("sunil.more@asego.in");
         driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin");
         driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();     
    }

}