package com.crm.qa.base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public static Logger log = Logger.getLogger(TestBase.class);

    public ExtentReports extent = new ExtentReports();
    public ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");

    public TestBase(){
        try{
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\ramku\\IdeaProjects\\ThredUpTest\\" +
                    "src\\main\\java\\com\\crm\\qa\\config\\config.properties");
            prop.load(ip);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void initialization(){
        log.info("Browser Name: "+ prop.getProperty("browser"));
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if(browserName.equals("FF")){
            driver = new FirefoxDriver();
        }

        log.info("Application URL :" + prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }
}
