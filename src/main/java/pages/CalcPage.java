package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalcPage {
    @FindBy(css = "div[jsname='bkEvMb']")
    public WebElement zero;

    @FindBy(css = "div[jsname='N10B9']")
    public WebElement one;

    @FindBy(css = "div[jsname='lVjWed']")
    public WebElement two;

    @FindBy(css = "div[jsname='KN1kY']")
    public WebElement three;

    @FindBy(css = "div[jsname='xAP7E']")
    public WebElement four;

    @FindBy(css = "div[jsname='Ax5wH']")
    public WebElement five;

    @FindBy(css = "div[jsname='abcgof']")
    public WebElement six;

    @FindBy(css = "div[aria-label*='откр']")
    public WebElement openingBracket;

    @FindBy(css = "div[aria-label*='закр']")
    public WebElement closingBracket;

    @FindBy(css = "div[aria-label*='слож']")
    public WebElement addition;

    @FindBy(css = "div[aria-label*='умнож']")
    public WebElement multiplication;

    @FindBy(css = "div[aria-label*='вычит']")
    public WebElement subtraction;

    @FindBy(css = "div[aria-label*='делен']")
    public WebElement division;

    @FindBy(css = "div[aria-label*='равно']")
    public WebElement equal;

    @FindBy(css = "div[aria-label*='синус']")
    public WebElement sin;

    @FindBy(css = "#cwos")
    public WebElement result;

    @FindBy(css = "span[jsname='ubtiRe']")
    public WebElement expression;

    public CalcPage(WebDriver driver) {
        initElements(driver, this);
    }
}
