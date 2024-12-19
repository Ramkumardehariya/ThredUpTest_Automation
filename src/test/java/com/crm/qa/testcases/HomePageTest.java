package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage;

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = homePage.validateHomePageTitle();
        Assert.assertEquals(title, "ThredUp | An Online Consignment & Thrift Store");
    }

    @Test(priority = 3)
    public void homePageTest() throws InterruptedException {
        homePage.home();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
