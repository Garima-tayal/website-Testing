package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ElementUtil {
    WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElementVisible(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator) {
        waitForElementVisible(locator, 10).click();
    }

    public String getText(By locator) {
        return waitForElementVisible(locator, 10).getText();
    }

    public boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public int getElementsCount(By locator) {
        return driver.findElements(locator).size();
    }
}
