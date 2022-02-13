package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CalcPage;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest1 {
    private static WebDriver driver;
    private static SearchPage searchPage;
    private static CalcPage calcPage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        calcPage = new CalcPage(driver);
    }

    @Test
    public void test1() {
        driver.get("https://google.com");
        searchPage.search("Калькулятор");
        calcPage.openingBracket.click();
        calcPage.one.click();
        calcPage.addition.click();
        calcPage.two.click();
        calcPage.closingBracket.click();
        calcPage.multiplication.click();
        calcPage.three.click();
        calcPage.subtraction.click();
        calcPage.four.click();
        calcPage.zero.click();
        calcPage.division.click();
        calcPage.five.click();
        calcPage.equal.click();
        assertEquals("1", calcPage.result.getText());
    }

    @Test
    public void test2() {
        driver.get("https://google.com");
        searchPage.search("Калькулятор");
        calcPage.six.click();
        calcPage.division.click();
        calcPage.zero.click();
        calcPage.equal.click();
        assertEquals("6 ÷ 0 =", calcPage.expression.getText());
        assertEquals("Infinity", calcPage.result.getText());
    }

    @Test
    public void test3() {
        driver.get("https://google.com");
        searchPage.search("Калькулятор");
        calcPage.sin.click();
        calcPage.equal.click();
        assertEquals("sin() =", calcPage.expression.getText());
        assertEquals("Error", calcPage.result.getText());
    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
