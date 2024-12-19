package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleLogInPage extends TestBase {

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

    public MultipleLogInPage(){
        PageFactory.initElements(driver, this);
    }

    public String mvalidateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean mvalidatethredUpImage(){
        return thredUpLogo.isDisplayed();
    }

    public HomePage mlmogin(String un, String pwd) throws InterruptedException {
        Thread.sleep(4000);
        closeSetting.click();
        Thread.sleep(4000);
        closeExtraThigs.click();
        Thread.sleep(4000);
        myProfile.click();
        clickForLogin.click();
        username.sendKeys(un);
        password.sendKeys(pwd);

        Thread.sleep(4000);
        loginBtn.click();

        return new HomePage();
    }
}
