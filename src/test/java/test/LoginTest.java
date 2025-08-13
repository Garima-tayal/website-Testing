package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyCoursesPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToLogin();
        loginPage.login("garimatayal004@gmail.com", "#Garima004");

        MyCoursesPage myCourses = new MyCoursesPage(driver);
        Assert.assertTrue(myCourses.isMyCoursesDisplayed(), "Login failed or My Courses not visible");
    }
}
