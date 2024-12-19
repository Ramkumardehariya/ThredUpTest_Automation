package com.crm.qa.testcases;
import com.crm.qa.base.TestBase;
import com.crm.qa.listener.Listener;
import com.crm.qa.pages.LogInPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class LoginPageTest extends TestBase {
    LogInPage logInPage;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        logInPage = new LogInPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = logInPage.validateLoginPageTitle();
        Assert.assertEquals(title, "ThredUp | An Online Consignment & Thrift Store");
    }

    @Test(priority = 2)
    public void thredUpLogoImageTest(){
        boolean flag = logInPage.validatethredUpImage();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.BLOCKER)
    @Description("User Login the Application ")
    @Feature("Login: 1")
    @Story("The User enter the valid name and password then login the Application")
    public void loginTest() throws InterruptedException {
        log.info("Log in Test Method Running...");
        logInPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
