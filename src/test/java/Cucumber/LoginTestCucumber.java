package Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCucumber {
    WebDriver driver;

    @Given("User is on login page")
    public void userLogin() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.thredup.com/u/login?state=hKFo2SAyODNlQnQyWVRyUXJ3cXF5NUs5dExsZGM4ZXcxTHNfNaFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIHpSeS1uMTdJTllaWWJPYkJMTFcwOFp4bE1ZYjRYbkhUo2NpZNkgTU1pQUxGcDlxakVxWVBPNVBrMFNrcklzcFpMMHBLa1E");
    }

    @When("User Enter the Username as {string}")
    public void userEnterUsername(String uName) {
        driver.findElement(By.name("username")).sendKeys(uName);
    }

    @When("User enter Password as {string}")
    public void userEnterPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("click on submit button")
    public void clickOnLoginButton() {
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
