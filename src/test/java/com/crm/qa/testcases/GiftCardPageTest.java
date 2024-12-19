package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.GiftCardPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCardPageTest extends TestBase {
    GiftCardPage giftCardPage;

    public GiftCardPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        giftCardPage = new GiftCardPage();
    }

    @Test(priority = 1)
    public void giftTitleTest(){
        String title = giftCardPage.validateGiftCardTitle();
        Assert.assertEquals(title, "ThredUp | An Online Consignment & Thrift Store");
    }

    @Test(priority = 2)
    public void giftPageTest() throws InterruptedException {
        giftCardPage.giftCard();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
