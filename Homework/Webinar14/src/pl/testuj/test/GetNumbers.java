package pl.testuj.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GetNumbers extends BaseTest {

    @Test
    public void getNumbers() {
        String webPage = "https://www.bbc.com/";
        driver.get(webPage);
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        int numberOfLinks = linksList.size();
        List<WebElement> imagesList = driver.findElements(By.tagName("img"));
        int numberOfImages = imagesList.size();
        System.out.println(webPage + " contains " + numberOfLinks + " links and " + numberOfImages + " images");
    }


}
