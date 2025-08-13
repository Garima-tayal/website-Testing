package pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MockTestPage {
    WebDriver driver;

    public MockTestPage(WebDriver driver) {
        this.driver = driver;
    }

    By startTestButton = By.xpath("//button[contains(text(),'Start the test')]");

    public void clickStartTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement startButton = wait.until(ExpectedConditions.visibilityOfElementLocated(startTestButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", startButton);
    }
    public void goBackToChapterPage() {
        driver.navigate().back();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//h3[contains(text(),'Video/Audio')]")
        ));
    }

}
