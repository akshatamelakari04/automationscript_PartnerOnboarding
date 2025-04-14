package Partner_Onboarding.Partner_Onboarding;

import org.openqa.selenium.WebDriver;
import java.awt.AWTException;

public class TestAutomationRunner {
    public static void main(String[] args) throws InterruptedException, AWTException 
    {
        WebDriver driver = WebDriverSetup.initializeDriver();
        
        // Login Process
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        // Partner Onboarding Process
        PartnerOnboardingPage partnerOnboardingPage = new PartnerOnboardingPage(driver);
        partnerOnboardingPage.partnerOnboarding();
        partnerOnboardingPage.enterBusinessDetails();
        partnerOnboardingPage.enterBankingDetails();
        partnerOnboardingPage.enterCommercialDetails();
        partnerOnboardingPage.enterSalesOnboardingDetails();
      //  partnerOnboardingPage.enterrefferalDetails();
       // driver.quit();
    }
}
