package pl.testuj.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogin extends BaseTest {

    public void openAndLogin(String userLogin, String userPassword) {

        String webPage = "https://opensource-demo.orangehrmlive.com/";
        driver.get(webPage);

        WebElement inputLogin = driver.findElement(By.id("txtUsername"));
        inputLogin.sendKeys(userLogin);

        WebElement inputPassword = driver.findElement(By.id("txtPassword"));
        inputPassword.sendKeys(userPassword);

        WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
        buttonLogin.click();

    }

    @Test
    public void verifyValidLogin() {

        openAndLogin("Admin", "admin123");

        WebElement welcomeElement = driver.findElement(By.id("welcome"));
        String welcomeText = welcomeElement.getText();

        Assert.assertTrue(welcomeText.contains("Welcome"));

    }

    @Test
    public void verifyInvalidLogin() {

        openAndLogin("WrongUsername", "WrongPassword");

        WebElement message = driver.findElement(By.id("spanMessage"));
        String messageText = message.getText();

        Assert.assertTrue(messageText.contains("Invalid credentials"));
    }

}
