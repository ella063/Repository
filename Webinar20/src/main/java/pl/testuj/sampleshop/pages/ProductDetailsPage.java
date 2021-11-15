package pl.testuj.sampleshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


/*
ZADANIE DOMOWE:
- dodanie możliwości wskazania ilości produktów
- sprawdzić czy dodało do koszyka: tylko modal + komunikat "Produkt dodany poprawnie do Twojego koszyka"
 */
public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[data-button-action='add-to-cart']")
    private WebElement addToCartButton;
    @FindBy(css = "select#group_1")
    private WebElement sizeSelect;

    @FindBy (xpath = "//input[@id=\"quantity_wanted\"]")
    private WebElement quantitySelect;

    @FindBy (xpath = "//div[contains(@class,\"input-group\")]//button[contains(@class,\"up\")]")
    private WebElement quantityButtonUp;

    @FindBy (xpath = "//div[contains(@class,\"input-group\")]//button[contains(@class,\"down\")]")
    private WebElement quantityButtonDown;

    @FindBy (xpath = "//div[@id=\"blockcart-modal\"]//h4")
    public WebElement cartModalTitle;



    public void selectSize(String sizeToSelect) {
        LOGGER.debug("Wybieram rozmiar " + sizeToSelect);
        Select sizeSelectElement = new Select(sizeSelect);
        sizeSelectElement.selectByVisibleText(sizeToSelect);
    }

    public void clickAddToCartButton() {
        LOGGER.debug("klikam dodawanie do koszyka");
        buttonClick(addToCartButton);
    }

    public void selectColor(String colorName) {
        LOGGER.info("Wybieram kolor " + colorName);
        WebElement selectColorElement = driver.findElement(By.xpath("//input[@class=\"input-color\"][@title=\"" + colorName + "\"]"));
        selectColorElement.click();
    }

    public void setQuantityByText(String quantity) {
        quantitySelect.sendKeys(Keys.INSERT);
        quantitySelect.sendKeys(quantity);
    }

    public void quantityUp() { buttonClick(quantityButtonUp); }

    public void quantityDown() { buttonClick(quantityButtonDown); }

    public void setQuantityByButton(int quantity) {
        for (int i = 1; i < quantity; i++) {
            quantityUp();
        }
    }
}
