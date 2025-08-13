package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyCoursesPage;

public class MyCoursesTest extends BaseTest {

    @Test
    public void testCoursesVisible() {
    	LoginPage loginPage = new LoginPage(driver);
        loginPage.goToLogin();
        loginPage.login("garimatayal004@gmail.com", "#Garima004");

        MyCoursesPage coursePage = new MyCoursesPage(driver);
        Assert.assertTrue(coursePage.isMyCoursesDisplayed(), "Courses are not visible");
    }
}
