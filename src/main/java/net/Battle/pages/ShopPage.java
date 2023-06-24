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

    @FindBy(xpath = "//div[@class=\"title meka-font-display meka-font-display--header-7\"]")
    private WebElement buttonOfCertainGameHearthstone;

    @FindBy(xpath = "//div[@class=\"title meka-font-display meka-font-display--header-7\"][text()=\" Call of Duty®: Black Ops 4 \"]")
    private WebElement buttonOfCertainGameCallOfDutyBlackOps4;

    @FindBy(id = "wishlist.action.add")
    private WebElement addToCartButton;

    @FindBy(id = "wishlist.action.view")
    private WebElement viewCartButton;

    @FindBy(xpath = "//div[@class=\"browsing-card\"]/h2[text()=\" Hearthstone® \"]")
    private WebElement gameCardHearthstone;

    @FindBy(xpath = "//div[@class=\"browsing-card\"]/h2[text()=\" Call of Duty®: Black Ops 4 \"]")
    private WebElement gameCardCallOfDutyBlackOps4;


    public WebElement getShopButton() {
        return shopButton;
    }

    public WebElement getSearchGameField() {
        return searchGameField;
    }

    public WebElement getButtonOfCertainGameHearthstone() {
        return buttonOfCertainGameHearthstone;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    public WebElement getGameCardHearthstone() {
        return gameCardHearthstone;
    }

    public WebElement getButtonOfCertainGameCallOfDutyBlackOps4() {
        return buttonOfCertainGameCallOfDutyBlackOps4;
    }

    public WebElement getGameCardCallOfDutyBlackOps4() {
        return gameCardCallOfDutyBlackOps4;
    }
}
