package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyCoursesPage;

public class CourseStartTest extends BaseTest {

    @Test
    public void testStartNowButton() {
    	LoginPage loginPage = new LoginPage(driver);
        loginPage.goToLogin();
        loginPage.login("garimatayal004@gmail.com", "#Garima004");

        MyCoursesPage coursePage = new MyCoursesPage(driver);
        coursePage.clickStartNow();

    }
}

