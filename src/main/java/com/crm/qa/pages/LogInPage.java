package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends TestBase {

    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement loginBtn;

    @FindBy(xpath =  "//a[@href='/my']")
    WebElement myProfile;

    @FindBy(xpath = "//a[text()='Log In']")
    WebElement clickForLogin;

    @FindBy(xpath = "//img[@alt='ThredUp Logo']")
    WebElement thredUpLogo;

    @FindBy(xpath = "(//img[@alt='Close'])[2]")
    WebElement closeSetting;

    @FindBy(xpath = "(//img[@alt='Close'])[1]")
    WebElement closeExtraThigs;

    public LogInPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validatethredUpImage(){
        return thredUpLogo.isDisplayed();
    }

    public HomePage login(String un, String pwd) throws InterruptedException {
        Thread.sleep(4000);
        closeSetting.click();
        Thread.sleep(4000);
        closeExtraThigs.click();
        myProfile.click();
        clickForLogin.click();
        username.sendKeys(un);
        password.sendKeys(pwd);
        Thread.sleep(4000);
        loginBtn.click();

        return new HomePage();
    }

}
