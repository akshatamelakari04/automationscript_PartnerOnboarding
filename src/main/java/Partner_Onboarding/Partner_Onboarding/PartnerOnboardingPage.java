package Partner_Onboarding.Partner_Onboarding;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PartnerOnboardingPage 
{
	WebDriver driver;

	public PartnerOnboardingPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void partnerOnboarding() throws InterruptedException 
	{
		// Partner-Onboard
		driver.findElement(By.xpath("//span[text()='Manage Asego Partner']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Partner Onboarding']")).click();
		Thread.sleep(2000);
	}

	// Method for Business Details
	public void enterBusinessDetails() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@formcontrolname=\"partnerName\"]")).sendKeys("Tours and Travel-17-04-25");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Proprietor Name\"]")).sendKeys("Abc");
		driver.findElement(By.xpath("(//input[@formcontrolname=\"address\"])[1]")).sendKeys("Mg Road");
		driver.findElement(By.xpath("(//input[@formcontrolname=\"pinCode\"])[1]")).sendKeys("400005");
		Thread.sleep(2000); // --------

		WebElement dropdown = driver.findElement(By.id("business-type"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Company");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jogijegrobo-9871@yopmail.com");

		Thread.sleep(2000);

		WebElement dropdown1 = driver.findElement(By.xpath("//input[@formcontrolname='natureOfBusiness']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown1).click().perform();
		WebElement freelancerOption = driver.findElement(By.xpath("//mat-option/span[text()=' Freelancer ']"));
		freelancerOption.click();

		driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("8485057792");
		Thread.sleep(6000);
		WebElement continueButton1 = driver.findElement(By.xpath("//button[@id='next_button']"));

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", continueButton1);
	}

	// Method for Banking Details
	public void enterBankingDetails() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//input[@name=\"bank-name\"]")).sendKeys("ICICI Bank Ltd");
		driver.findElement(By.xpath("//input[@name=\"bank-address\"]")).sendKeys("Bangalore");
		WebElement accountTypeDropdown = driver
				.findElement(By.xpath("//select[@placeholder=\"Enter Saving Account \"]"));
		Select select1 = new Select(accountTypeDropdown);
		select1.selectByVisibleText("Savings");
		driver.findElement(By.xpath("//input[@name=\"account-no\"]")).sendKeys("12345678912345");
		driver.findElement(By.xpath("(//input[@name=\"ifsc-code \"])[1]")).sendKeys("ICIC0006281");
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		// Use JavaScript to remove the hidden class (if applicable)
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//img[@id=\"chequeFileImg\"]")));
		Thread.sleep(2000);
		StringSelection Filepathselection = new StringSelection("C:\\Users\\Akshata Melakari\\Desktop\\logo (4).PNG");
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Filepathselection, null);
		Thread.sleep(4000);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement continueButton2 = driver.findElement(By.xpath("//button[@id=\"next_button\"]"));

		// Click the "CONTINUE" button using JavaScript
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", continueButton2);
	}

	// Method for Commercial Details
	public void enterCommercialDetails() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@formcontrolname=\"PANNumber\"])[1]")).sendKeys("QWERA2345T");

		WebElement PANType = driver.findElement(By.xpath("(//select[@id=\"pan-type \"])[1]"));
		Select select2 = new Select(PANType);
		select2.selectByVisibleText("Non-Company");
		driver.findElement(By.xpath("//input[@id=\"sameAsBusinessDetails\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"contact-person\"]")).sendKeys("Guru");
		driver.findElement(By.xpath("//input[@formcontrolname=\"TDSPercentage\"]")).sendKeys("3");
		WebElement continueButton3 = driver.findElement(By.xpath("//button[@id=\"next_button\"]"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", continueButton3);
		Thread.sleep(3000);
	}

	// Method for Sales Onboarding
	public void enterSalesOnboardingDetails() throws InterruptedException {
		driver.findElement(By.xpath("//mat-select[@placeholder=\"Asego Branch\"]"));
		WebElement dropdown2 = driver.findElement(By.xpath("//div[@class=\"mat-select-value ng-tns-c62-16\"]"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown2).click().perform();
		WebElement AsegoBranch = driver.findElement(By.xpath("//span[text()=\" ALT Andheri \"]"));
		AsegoBranch.click();

		Thread.sleep(2000);
		WebElement CRM = driver.findElement(By.id("clientRelationshipManagerName"));
		Select select3 = new Select(CRM);
		select3.selectByVisibleText(" Ashish S   ");

		Thread.sleep(2000);
		WebElement MSCType = driver.findElement(By.id("msc-type"));
		Select select4 = new Select(MSCType);
		select4.selectByVisibleText("Upfront Commission");

		Thread.sleep(2000);
		WebElement invoiceType = driver.findElement(By.id("invoice-type"));
		Select select5 = new Select(invoiceType);
		select5.selectByVisibleText("Passenger Wise");

		Thread.sleep(2000);
		WebElement Partnership = driver.findElement(By.xpath("//select[@formcontrolname=\"partnershipRenewal\"]"));
		Select select6 = new Select(Partnership);
		select6.selectByVisibleText("6 Months");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Decentralised\"]")).click();
		WebElement assignplanModal = driver.findElement(By.xpath("//button[@data-bs-target=\"#assignplanModal\"]"));
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].click();", assignplanModal);

		Thread.sleep(4000);
		WebElement category = driver.findElement(By.xpath("(//select[@formcontrolname=\"category\"])[1]"));
		Select select7 = new Select(category);
		select7.selectByVisibleText(" Overseas ");

		Thread.sleep(2000);
		WebElement Insurer = driver.findElement(By.xpath("//select[@id=\"insurer\"]"));
		Select select8 = new Select(Insurer);
		select8.selectByVisibleText("All");
		Thread.sleep(2000);
		
		WebElement Datepicker = driver.findElement(By.xpath("//button[@aria-label=\"Open calendar\"]"));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].click();", Datepicker);
		Thread.sleep(2000);
		WebElement Todaysdate = driver.findElement(By.xpath("//button[@aria-label=\"27 April 2025\"]"));
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("arguments[0].click();", Todaysdate);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class=\"form-check-input success\"]")).click();
		driver.findElement(By.xpath("(//input[@name=\"MSCPercentage\"])[1]")).sendKeys("25");

		driver.findElement(By.xpath("(//div[@class=\"modal-body mt-0\"])[1]")).click();
		Thread.sleep(3000);
		WebElement Button7 = driver.findElement(By.xpath("//button[text()=\"ASSIGN PLAN\"]"));
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("arguments[0].click();", Button7);
		Thread.sleep(3000);

		WebElement Button8 = driver.findElement(By.xpath("//button[@data-bs-target=\"#assignMSCPercentCollapse\"]"));
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("arguments[0].click();", Button8);
		Thread.sleep(3000);

		WebElement Button9 = driver.findElement(By.xpath("//button[@data-bs-target=\"#assignMSCModal\"]"));
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("arguments[0].click();", Button9);
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//table[@class=\"table table-striped\"])[2]/tbody/tr[1]/td[2]/input"))
				.sendKeys("0");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//table[@class=\"table table-striped\"])[2]/tbody/tr[2]/td[2]/input"))
				.sendKeys("2");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//table[@class=\"table table-striped\"])[2]/tbody/tr[3]/td[2]/input"))
				.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table[@class=\"table table-striped\"])[2]/tbody/tr[4]/td[2]/input"))
				.sendKeys("3");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//table[@class=\"table table-striped\"])[2]/tbody/tr[5]/td[2]/input"))
				.sendKeys("2");
		Thread.sleep(500);

		WebElement Button10 = driver.findElement(By.xpath("//button[text()=\"ASSIGN MSC %\"]"));
		JavascriptExecutor js10 = (JavascriptExecutor) driver;
		js10.executeScript("arguments[0].click();", Button10);
		Thread.sleep(3000);
		
		WebElement NonReferraltoggle = driver.findElement(By.xpath("//input[@value=\"Non Referral Account\"]"));
		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		js13.executeScript("arguments[0].click();", NonReferraltoggle);
		Thread.sleep(5000);
		
		WebElement Submit = driver.findElement(By.xpath("//button[text()=\"SUBMIT\"]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", Submit);
		Thread.sleep(3000);
		
		driver.findElement(By.id("popupButton")).click(); // Replace with your actual element
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println("Popup message is: " + alertMessage);
		
		
	}
		//Refferal Details

	/*public void enterrefferalDetails() throws InterruptedException 
		{
			WebElement AsegoPartner = driver.findElement(By.xpath("//input[@value=\"Asego Partner\"]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AsegoPartner);
			Thread.sleep(500);  
			AsegoPartner.click();
			Thread.sleep(5000);

			WebElement AsegoPartnerlist = driver.findElement(By.xpath("//div[@class=\"mat-select-arrow ng-tns-c62-25\"]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AsegoPartnerlist);
			Thread.sleep(500);  
			AsegoPartnerlist.click();
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//div[@class=\"mat-form-field-infix ng-tns-c60-22\"]")).click();
			WebElement dropdown3 = driver.findElement(By.xpath("//span[text()=\" Ashok Dattu Kodte \"]"));
			Actions actions3 = new Actions(driver);
			actions3.moveToElement(dropdown3).click().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder=\"Enter Referral Commission\"]")).sendKeys("2");
			Thread.sleep(3000);
			
			WebElement Submit = driver.findElement(By.xpath("//button[text()=\"SUBMIT\"]"));
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			js12.executeScript("arguments[0].click();", Submit);	
		}
		*/
}
