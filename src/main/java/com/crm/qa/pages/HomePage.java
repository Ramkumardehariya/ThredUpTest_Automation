package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath="(//a[@href='/about'])[1]")
    WebElement checkbAoutPage;

    @FindBy(xpath="//span[text()='Sell']")
    WebElement clickSellPage;

    @FindBy(xpath = "//img[@alt='My ThredUp']")
    WebElement clickOnSaveItem;


    @FindBy(xpath = "(//div/img[@loading='lazy'])[1]")
    WebElement clickOnAddtoCart;

    @FindBy(xpath = "//img[@alt='Gift Icon']")
    WebElement clickOnGiftCart;

    @FindBy(xpath = "(//img[@alt='Close'])[2]")
    WebElement closeSetting;

    @FindBy(xpath = "(//img[@alt='Close'])[1]")
    WebElement closeExtraThigs;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String validateHomePageTitle(){
        return driver.getTitle();
    }

    public void home() throws InterruptedException {
        Thread.sleep(5000);
        closeSetting.click();
        Thread.sleep(4000);
        closeExtraThigs.click();
        Thread.sleep(4000);

        checkbAoutPage.click();
        Thread.sleep(4000);
        clickSellPage.click();
        Thread.sleep(4000);
        clickOnSaveItem.click();
        Thread.sleep(4000);
        clickOnAddtoCart.click();
        Thread.sleep(4000);
        clickOnGiftCart.click();

    }
}
