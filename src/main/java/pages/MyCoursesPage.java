package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCoursesPage {
    WebDriver driver;

    By myCoursesHeading = By.xpath("//h1[contains(text(),'My courses')]");
    By startNowButton = By.xpath("//button[contains(text(),'Start Now')]"); 

    public MyCoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMyCoursesDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(myCoursesHeading));
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("element not found " + e.getMessage());
            return false;
        }
    }

    public void clickStartNow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(startNowButton));
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
    }
}
