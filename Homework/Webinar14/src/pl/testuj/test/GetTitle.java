package pl.testuj.test;

import org.testng.annotations.Test;

public class GetTitle extends BaseTest {

    @Test
    public void getTitle() {
        driver.get("https://testuj.pl/");
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
    }


}
