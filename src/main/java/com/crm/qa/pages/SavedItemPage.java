package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavedItemPage extends TestBase {

    @FindBy(xpath = "//img[@alt='My ThredUp']")
    WebElement clickOnSaveItem;

    @FindBy(xpath="//a[@data-text='Favorites']")
    WebElement checkFavorite;

    @FindBy(xpath="//a[@data-text='Saved Searches']")
    WebElement checkSavedSearches;

    @FindBy(xpath = "//button[text()='All']")
    WebElement checkAllItem;

    @FindBy(xpath =  "//button[text()='Available']")
    WebElement checkAvailableItem;

    @FindBy(xpath = "//button[text()='Sold']")
    WebElement checkSoldItem;

    @FindBy(xpath = "//button[contains(text(),'In someone')]")
    WebElement checkSomeOneCart;

    @FindBy(xpath = "(//img[@alt='Close'])[2]")
    WebElement closeSetting;

    @FindBy(xpath = "(//img[@alt='Close'])[1]")
    WebElement closeExtraThigs;

    public SavedItemPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateHomePageTitle(){
        return driver.getTitle();
    }

    public void savedItemPageTes() throws InterruptedException {
        Thread.sleep(5000);
        closeSetting.click();
        Thread.sleep(4000);
        closeExtraThigs.click();
        Thread.sleep(4000);

        clickOnSaveItem.click();
        Thread.sleep(4000);
        checkSavedSearches.click();
        Thread.sleep(4000);
        checkFavorite.click();
        Thread.sleep(4000);
        checkAllItem.click();
        Thread.sleep(4000);

        checkAvailableItem.click();
        Thread.sleep(4000);
        checkSoldItem.click();
        Thread.sleep(4000);
        checkSomeOneCart.click();
    }
}
