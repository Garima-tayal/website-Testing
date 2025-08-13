package pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CourseContentPage {
    WebDriver driver;

    public CourseContentPage(WebDriver driver) {
        this.driver = driver;
    }

    By chapterOne = By.xpath("//h5[contains(text(),'Chapter') and contains(text(),'1')]/ancestor::div[contains(@class,'card')]");

    public void clickChapterOne() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement chapter = wait.until(ExpectedConditions.elementToBeClickable(chapterOne));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chapter);
        chapter.click();
    }
}
