package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By loginBtn = By.linkText("Login");
    By emailInput = By.id("email");
    By passwordInput = By.id("inputPassword");
    By submitBtn = By.xpath("//button[contains(text(),'Login')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLogin() {
        driver.findElement(loginBtn).click();
    }

    public void login(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(submitBtn).click();
    }
}
