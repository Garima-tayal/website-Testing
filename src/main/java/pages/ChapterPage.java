package pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChapterPage {
    WebDriver driver;

    public ChapterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMockTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        
        By mockTestCard = By.xpath("//p[contains(text(),'This is to test the knowledge of basic SCRUM.')]/ancestor::div[contains(@class,'card')]");
      
        WebElement mockTest = wait.until(ExpectedConditions.elementToBeClickable(mockTestCard));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mockTest);
        mockTest.click();
    }
    
    public void playVideo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.cssSelector("iframe[src*='youtube.com']")
        ));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", iframe);
        
        driver.switchTo().frame(iframe);

        WebElement playButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("button.ytp-large-play-button.ytp-button")
        ));
        
        playButton.click();
        
       try { 
        	Thread.sleep(10000);
        }catch (InterruptedException e) {
        	e.printStackTrace();
        }
        
        WebElement VideoArea = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("video.video-stream")));
        VideoArea.click();
        driver.switchTo().defaultContent();
    }
       
    public void openAgile() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            WebElement agileCard = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//h5[contains(text(),'Agile vs Waterfall')]/ancestor::div[contains(@class,'card')]")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", agileCard);
            agileCard.click();
            System.out.println("Clicked on Agile card");

            WebElement pdfIframe = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("iframe[src*='viewDocument']")
            ));
            System.out.println("PDF iframe appeared");

            driver.switchTo().frame(pdfIframe);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
            System.out.println("PDF content loaded inside iframe");

            driver.switchTo().defaultContent();
            System.out.println("Switched back from iframe");

        } catch (Exception e) {
            System.out.println("PDF viewer failed: " + e.getMessage());
        }
    }


     

    

}
