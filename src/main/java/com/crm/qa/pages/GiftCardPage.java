package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardPage extends TestBase {

    @FindBy(xpath="//img[@alt='Gift Icon']")
    WebElement clickOnGiftCard;

    @FindBy(xpath="(//span[@class='mdc-tab__ripple'])[1]")
    WebElement checkOnPhysicalCards;

    @FindBy(xpath="(//span[@class='mdc-tab__ripple'])[2]")
    WebElement checkOnDigitalCards;

    @FindBy(xpath = "(//span[@class='mdc-button__touch'])[1]")
    WebElement checkOnMenubar;

    @FindBy(xpath = "//a[@data-testid='NavbarLinks_OrderStatusButton']")
    WebElement checkOrderStatus;

    @FindBy(xpath = "(//li[@role='menuitem'])[4]")
    WebElement checkYourbalance;

    @FindBy(xpath = "(//img[@alt='Close'])[2]")
    WebElement closeSetting;

    @FindBy(xpath = "(//img[@alt='Close'])[1]")
    WebElement closeExtraThigs;

    public GiftCardPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateGiftCardTitle(){
        return driver.getTitle();
    }

    public void giftCard() throws InterruptedException {
        Thread.sleep(5000);
        closeSetting.click();
        Thread.sleep(4000);
        closeExtraThigs.click();
        Thread.sleep(4000);

        clickOnGiftCard.click();
        Thread.sleep(4000);
        checkOnPhysicalCards.click();
        Thread.sleep(4000);
        checkOnDigitalCards.click();
        Thread.sleep(4000);
        checkOnMenubar.click();
        Thread.sleep(4000);
        checkOrderStatus.click();
        Thread.sleep(4000);
        checkOnMenubar.click();
        Thread.sleep(4000);
        checkYourbalance.click();
    }
}
