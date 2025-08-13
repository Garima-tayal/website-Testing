package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyCoursesPage;
import pages.CourseContentPage;

public class ChapterTest extends BaseTest {

    @Test
    public void testNavigateToChapter1() {
    	LoginPage loginPage = new LoginPage(driver);
        loginPage.goToLogin();
        loginPage.login("garimatayal004@gmail.com", "#Garima004");

        MyCoursesPage coursePage = new MyCoursesPage(driver);
        coursePage.clickStartNow();
        
        CourseContentPage chapter = new CourseContentPage(driver);
        chapter.clickChapterOne();
    }    
}
