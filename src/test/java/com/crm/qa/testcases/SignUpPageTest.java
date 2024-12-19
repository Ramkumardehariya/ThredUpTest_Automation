package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest extends TestBase {
    SignUpPage signUpPage;
    HomePage homePage;

    public SignUpPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        signUpPage = new SignUpPage();
    }

    @Test(priority = 1)
    public void signUpPageTitleTest() throws InterruptedException {
        String title = signUpPage.validateSignPageTitle();
        Assert.assertEquals(title, "ThredUp | An Online Consignment & Thrift Store");
    }

    @Test(priority = 2)
    public void thredUpLogoImageTest() throws InterruptedException {
        boolean flag = signUpPage.validateThredUpImage();
        Assert.assertTrue(flag);
    }


    @Test(priority = 3)
    public void signUpTest() throws InterruptedException {
        homePage = signUpPage.signUp(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
