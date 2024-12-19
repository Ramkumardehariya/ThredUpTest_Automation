package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.MultipleLogInPage;
import com.crm.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleLoginPageTest extends TestBase {
    MultipleLogInPage multipleLogInPage;
    HomePage homePage;
    String SheetName ="Sheet1";


    public MultipleLoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        multipleLogInPage = new MultipleLogInPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = multipleLogInPage.mvalidateLoginPageTitle();
        Assert.assertEquals(title, "ThredUp | An Online Consignment & Thrift Store");
    }

    @Test(priority = 2)
    public void thredUpLogoImageTest(){
        boolean flag = multipleLogInPage.mvalidatethredUpImage();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void loginTest() throws InterruptedException {
        homePage = multipleLogInPage.mlmogin(prop.getProperty("username"), prop.getProperty("password"));
    }

    @DataProvider
    public Object[][] getLoginTestData () {
        Object data[][] = TestUtil.getTestData(SheetName);
        return data;
    }
    @Test(dataProvider = "getLoginTestData", priority = 4)
    public void multipleUserLoginTest (String username, String password) throws InterruptedException {
        log.info("Multiple user try to login the application");
        multipleLogInPage.mlmogin(username, password);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
