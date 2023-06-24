package net.Battle.steps;


import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import net.Battle.pages.ShopPage;
import net.Battle.utils.Waiter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ShopStep {

    Waiter waiter;

    final ShopPage shopPage;

    public ShopStep(WebDriver driver) {
        shopPage = new ShopPage(driver);
    }

    @Step("Click shop button")
    public void clickShopButton() {
        log.info("Click shop button");
        shopPage.getShopButton().click();
    }

    @Step("Input name of the game")
    public void inputNameOfTheGame(String nameOfTheGame) throws InterruptedException {
        log.info("Input name of the game");
        shopPage.getSearchGameField().sendKeys(nameOfTheGame);
        Thread.sleep(5000);
        shopPage.getSearchGameField().sendKeys(Keys.ENTER);
    }

     @Step("Click button of certain game hearthstone")
    public void clickButtonOfCertainGameHearthstone() {
        log.info("Click button of certain game hearthstone");
        shopPage.getButtonOfCertainGameHearthstone().click();
    }

     @Step("Click button of certain game Call of Duty Black Ops 4")
    public void clickButtonOfCertainGameCallOfDutyBlackOps4() {
        log.info("Click button of certain game Call of Duty Black Ops 4");
        shopPage.getButtonOfCertainGameCallOfDutyBlackOps4().click();
    }

    @Step("Click add to cart button")
    public void clickAddToCartButton() {
        log.info("Click add to cart button");
        shopPage.getAddToCartButton().click();
    }

     @Step("Click view cart button")
    public void clickViewCartButton() {
        log.info("Click view cart button");
        shopPage.getViewCartButton().click();
    }

     @Step("Get card game hearthstone")
    public Boolean getCardGameHearthstone() {
        log.info("Get card game hearthstone");
        return shopPage.getGameCardHearthstone().isDisplayed();
    }

     @Step("Get card game Call of Duty Black Ops 4")
    public Boolean getCardGameCallOfDutyBlackOps4() {
        log.info("Get card game Call of Duty Black Ops 4");
        return shopPage.getGameCardCallOfDutyBlackOps4().isDisplayed();
    }
}
