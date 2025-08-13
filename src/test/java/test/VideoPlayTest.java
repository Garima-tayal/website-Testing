package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class VideoPlayTest extends BaseTest {

    @Test
    public void testVideoPlayback() {
    	LoginPage loginPage = new LoginPage(driver);
        loginPage.goToLogin();
        loginPage.login("garimatayal004@gmail.com", "#Garima004");
        MyCoursesPage coursePage = new MyCoursesPage(driver);
        coursePage.clickStartNow();
        CourseContentPage course = new CourseContentPage(driver);
        course.clickChapterOne();
        ChapterPage chapter = new ChapterPage(driver);
        chapter.playVideo();
    }
}
