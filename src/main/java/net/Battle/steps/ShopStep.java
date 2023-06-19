package net.Battle.steps;

import lombok.extern.log4j.Log4j2;
import net.Battle.pages.ShopPage;
import org.openqa.selenium.WebDriver;
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

    public void inputNameOfTheGame(String nameOfTheGame) {
        log.info("Input name of the game");
        shopPage.getSearchGameField().sendKeys(nameOfTheGame);
    }
}
