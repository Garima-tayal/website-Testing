/*package test;

import base.BaseTest;
import pages.LoginPage;
import pages.MyCoursesPage;
import pages.CourseContentPage;
import pages.ChapterPage;
import pages.MockTestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CourseTest extends BaseTest {

    @Test(priority=1)
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        MyCoursesPage dashboardPage = new MyCoursesPage(driver);
        CourseContentPage content = new CourseContentPage(driver);
        ChapterPage chapterPage = new ChapterPage(driver);
        MockTestPage mockTestPage = new MockTestPage(driver);
        
        loginPage.goToLogin();
        loginPage.login("garimatayal004@gmail.com", "#Garima004");

        Assert.assertTrue(dashboardPage.isMyCoursesDisplayed(), "My Courses heading not displayed");
        
        dashboardPage.clickStartNow();
        content.clickChapterOne();
        chapterPage.clickMockTest();
        mockTestPage.clickStartTest();
        mockTestPage.goBackToChapterPage();
        chapterPage.playVideo();
        chapterPage.openAgile();
    }
   

    @Test(priority=2)
    public void verifyResponsiveUI() {

        driver.manage().window().setSize(new Dimension(375, 667));
        Assert.assertTrue(driver.findElement(By.cssSelector(".navbar-toggler")).isDisplayed());

        driver.manage().window().setSize(new Dimension(1366, 768));
        Assert.assertTrue(driver.findElement(By.cssSelector(".navbar")).isDisplayed());
    }

    @Test(priority=3)
    public void checkPageLoadTime() {

        long start = System.currentTimeMillis();
        driver.get("https://lektion.in/mycourses");
        long end = System.currentTimeMillis();
        Assert.assertTrue((end - start) < 10000, "Page took too long to load");
    }

    @Test(priority=4)
    public void verifyUIElementAfterScroll() {

        WebElement header = driver.findElement(By.cssSelector(".navbar"));
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        Assert.assertTrue(header.isDisplayed(), "Header not visible after scroll");
    }
 
}
*/