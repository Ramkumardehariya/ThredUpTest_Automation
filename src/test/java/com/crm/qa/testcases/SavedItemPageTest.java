package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.SavedItemPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SavedItemPageTest extends TestBase {
    SavedItemPage savedItemPage;

    public SavedItemPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        savedItemPage = new SavedItemPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = savedItemPage.validateHomePageTitle();
        Assert.assertEquals(title, "ThredUp | An Online Consignment & Thrift Store");
    }

    @Test(priority = 2)
    public void savedItemPageTest() throws InterruptedException {
        savedItemPage.savedItemPageTes();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
