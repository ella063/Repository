package pl.testuj.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyDragDrop extends BaseTest {

    @Test
    public void verifyDragDrop() {

        String webPage = "http://demo.guru99.com/test/drag_drop.html";
        driver.get(webPage);

        WebElement buttonToDrag = driver.findElement(By.cssSelector("#fourth"));
        WebElement dropOn = driver.findElement(By.cssSelector("#amt7 > li"));

        Actions buttonDragAndDrop = new Actions(driver);
        buttonDragAndDrop.dragAndDrop(buttonToDrag, dropOn).build().perform();

        WebElement debitMovement = driver.findElement(By.cssSelector("#t7"));
        String debitMovementText = debitMovement.getText();

        Assert.assertTrue(debitMovementText.equals("5000"));

    }

}
