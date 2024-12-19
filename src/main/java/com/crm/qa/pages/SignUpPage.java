package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends TestBase {

    @FindBy(name="email")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement signUpBtn;

    @FindBy(xpath =  "//a[@href='/my']")
    WebElement myProfile;

    @FindBy(xpath = "//a[text()='Sign Up']")
    WebElement clickForSignUp;

    @FindBy(xpath = "//img[@alt='ThredUp Logo']")
    WebElement thredUpLogo;

    @FindBy(xpath = "(//img[@alt='Close'])[2]")
    WebElement closeSetting;

    @FindBy(xpath = "(//img[@alt='Close'])[1]")
    WebElement closeExtraThigs;

    public SignUpPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateSignPageTitle() throws InterruptedException {
        return driver.getTitle();
    }

    public boolean validateThredUpImage() throws InterruptedException {
        Thread.sleep(5000);
        return thredUpLogo.isDisplayed();
    }

    public HomePage signUp(String un, String pwd) throws InterruptedException {
        Thread.sleep(4000);
        closeSetting.click();
        Thread.sleep(4000);
        closeExtraThigs.click();
        Thread.sleep(4000);

        myProfile.click();
        Thread.sleep(4000);
        clickForSignUp.click();
        Thread.sleep(4000);
        username.sendKeys(un);

        password.sendKeys(pwd);
        Thread.sleep(4000);
        signUpBtn.click();


        return new HomePage();
    }
}
