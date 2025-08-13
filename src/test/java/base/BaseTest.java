package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;
import utils.DriverFactory;
import utils.ExtentReportManager;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(Method method) {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://lektion.in");

        ExtentReportManager.createTest(method.getName());

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            ExtentReportManager.getTest().fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            ExtentReportManager.getTest().pass("Test passed");
        } else {
            ExtentReportManager.getTest().skip("Test skipped");
        }

        DriverFactory.quitDriver();
        ExtentReportManager.flushReport();
    }
}
