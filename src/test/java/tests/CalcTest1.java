package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest1 {
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[aria-label*='откр']")).click();
        driver.findElement(By.cssSelector("div[jsname='N10B9']")).click();
        driver.findElement(By.cssSelector("div[aria-label*='слож']")).click();
        driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();
        driver.findElement(By.cssSelector("div[aria-label*='закр']")).click();
        driver.findElement(By.cssSelector("div[aria-label*='умнож']")).click();
        driver.findElement(By.cssSelector("div[jsname='KN1kY']")).click();
        driver.findElement(By.cssSelector("div[aria-label*='вычит']")).click();
        driver.findElement(By.cssSelector("div[jsname='xAP7E']")).click();
        driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("div[aria-label*='делен']")).click();
        driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).click();
        driver.findElement(By.cssSelector("div[aria-label*='равно']")).click();
        assertEquals("1", driver.findElement(By.cssSelector("#cwos")).getText());
    }

    @Test
    public void test2() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='abcgof']")).click();
        driver.findElement(By.cssSelector("div[aria-label*='делен']")).click();
        driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("div[aria-label*='равно']")).click();
        assertEquals("6 ÷ 0 =", driver.findElement(By.cssSelector("span[jsname='ubtiRe']")).getText());
        assertEquals("Infinity", driver.findElement(By.cssSelector("#cwos")).getText());
    }

    @Test
    public void test3() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[aria-label*='синус']")).click();
        driver.findElement(By.cssSelector("div[aria-label*='равно']")).click();
        assertEquals("sin() =", driver.findElement(By.cssSelector("span[jsname='ubtiRe']")).getText());
        assertEquals("Error", driver.findElement(By.cssSelector("#cwos")).getText());
    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
