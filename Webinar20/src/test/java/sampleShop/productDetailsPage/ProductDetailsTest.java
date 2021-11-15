package sampleShop.productDetailsPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sampleShop.BaseTest;
import pl.testuj.sampleshop.pages.ProductDetailsPage;

import java.time.Duration;
import java.util.Set;

public class ProductDetailsTest extends BaseTest {
    private ProductDetailsPage productDetailsPage;

    @BeforeMethod
    public void openPage() {
        driver.get("http://sampleshop.inqa.pl/men/1-1-hummingbird-printed-t-shirt.html#/1-rozmiar-s/8-kolor-bialy");
    }

    @Test(description = "Zamawianie produktu - dodanie do koszyka")
    public void orderElement() {
        productDetailsPage = new ProductDetailsPage(driver);
        productDetailsPage.selectSize("M");
        productDetailsPage.selectColor("czarny");
        productDetailsPage.clickAddToCartButton();
    }

    @Test
    public void thisMethodWillFail() {
        Assert.assertEquals(1, 2);
    }

        @Test
    public void orderNumberOfElementsByText() {
        productDetailsPage= new ProductDetailsPage(driver);
        productDetailsPage.selectSize("M");
        productDetailsPage.selectColor("Biały");
        productDetailsPage.setQuantityByText("2");
        productDetailsPage.clickAddToCartButton();
    }

    @Test
    public void orderNumberOfElements() {
        productDetailsPage= new ProductDetailsPage(driver);
        productDetailsPage.selectSize("M");
        productDetailsPage.selectColor("Biały");
        productDetailsPage.setQuantityByButton(3);
        productDetailsPage.clickAddToCartButton();
    }

    @Test
    public void orderElementsAndVerifyCart() {
        productDetailsPage= new ProductDetailsPage(driver);
        productDetailsPage.selectSize("M");
        productDetailsPage.selectColor("Biały");
        productDetailsPage.setQuantityByButton(3);
        productDetailsPage.clickAddToCartButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productDetailsPage.cartModalTitle));
        String expectedTitle = "Produkt dodany poprawnie do Twojego koszyka";
        String actualTitle = productDetailsPage.cartModalTitle.getText().substring(1);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
