package net.Battle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage {

    protected WebDriver driver;

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-name=\"shop\"]")
    private WebElement shopButton;

    @FindBy(id = "search-desktop-input")
    private WebElement searchGameField;

    public WebElement getShopButton() {
        return shopButton;
    }

    public WebElement getSearchGameField() {
        return searchGameField;
    }
}
