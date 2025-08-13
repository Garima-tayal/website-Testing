package test;

import base.BaseTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.testng.Assert;

public class VisibilityTest extends BaseTest {

    @Test
    public void testElementVisibleAfterScroll() throws InterruptedException {
        driver.get("https://lektion.in");

        // Example: Scroll to footer (you can replace with any element)
        WebElement footer = driver.findElement(By.tagName("footer"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);
        Thread.sleep(2000); // Wait for scroll animation if any

        Assert.assertTrue(footer.isDisplayed(), "❌ Footer not visible after scrolling");
        System.out.println("✅ Footer is visible after scroll");
    }
}
