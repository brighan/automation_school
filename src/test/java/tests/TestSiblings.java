package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSiblings {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/large");
        String sibling2 = driver.findElement(By.cssSelector("div#siblings > div:nth-of-type(1) > div:nth-of-type(3) ")).getText();
        System.out.println(sibling2);

    }
}
