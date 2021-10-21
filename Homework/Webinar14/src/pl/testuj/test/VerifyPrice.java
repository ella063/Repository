package pl.testuj.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPrice extends BaseTest {

    @Test
    public void verifyPrice() {


        String webPage = "http://demo.guru99.com/payment-gateway/index.php";
        driver.get(webPage);

        Float price = getItemPrice();
        String numberOfItems = "3";

        addItemsToCart(numberOfItems);
        Float expectedPrice = countExpectedPrice(price, numberOfItems);
        Float actualPrice = checkItemsPrice();

        Assert.assertEquals(actualPrice, expectedPrice);

    }


    public Float getItemPrice() {

        WebElement priceElement = driver.findElement(By.cssSelector("#three > div > form > div > div:nth-child(2) > h3"));
        String priceString = priceElement.getText().substring(8);
        Float priceFloat = Float.valueOf(priceString);
        return priceFloat;

    }


    public void addItemsToCart(String numberOfItems) {

        WebElement quantityList = driver.findElement(By.name("quantity"));
        Select quantity = new Select(quantityList);
        quantity.selectByValue(numberOfItems);

        WebElement buyButton = driver.findElement(By.cssSelector("#three > div > form > div > div.\\33 u.\\31 2u\\$\\(small\\) > ul > li > input"));
        buyButton.click();

    }


    public Float countExpectedPrice(Float itemPrice, String itemsNumber) {

        Float items = Float.valueOf(itemsNumber);
        Float expectedPrice = itemPrice * items;
        return  expectedPrice;

    }

    public Float checkItemsPrice() {

        WebElement priceElement = driver.findElement(By.cssSelector("#three > div > form > div.row > div > font:nth-child(2)"));
        String priceString = priceElement.getText().substring(1);
        Float priceFloat = Float.valueOf(priceString);
        return priceFloat;

    }


}
