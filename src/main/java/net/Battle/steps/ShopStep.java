package net.Battle.steps;

import lombok.extern.log4j.Log4j2;
import net.Battle.pages.ShopPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class ShopStep {

    final ShopPage shopPage;

    public ShopStep(WebDriver driver) {
        shopPage = new ShopPage(driver);
    }

    public void clickShopButton() {
        log.info("Click shop button");
        shopPage.getShopButton().click();
    }

    public void inputNameOfTheGame(String nameOfTheGame) throws InterruptedException {
        log.info("Input name of the game");
        shopPage.getSearchGameField().sendKeys(nameOfTheGame);

        Thread.sleep(5000);

        shopPage.getSearchGameField().sendKeys(Keys.ENTER);

    }

    public void clickButtonOfCertainGameHearthstone() {
        log.info("Click button of certain game hearthstone");
        shopPage.getButtonOfCertainGameHearthstone().click();
    }

    public void clickAddToCartButton() {
        log.info("Click add to cart button");
        shopPage.getAddToCartButton().click();
    }

    public void clickViewCartButton() {
        log.info("Click view cart button");
        shopPage.getViewCartButton().click();
    }

    public Boolean getCardGameHearthstone() {
        log.info("Get card game hearthstone");
        return shopPage.getGameCardHearthstone().isDisplayed();
    }
}
