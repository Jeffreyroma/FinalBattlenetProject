import com.google.gson.internal.JsonReaderInternalAccess;
import net.Battle.driver.DriverManager;
import net.Battle.models.UserData;
import net.Battle.steps.AuthorizationFormStep;
import net.Battle.steps.ShopStep;
import net.Battle.utils.JsonReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BattleTest extends BaseTest {

    protected WebDriver driver;

    private AuthorizationFormStep authorizationFormStep;

    private ShopStep shopStep;

    @BeforeClass
    public void preparationBattleTest() {
        driver = DriverManager.getDriver();
        authorizationFormStep = new AuthorizationFormStep(driver);
        shopStep = new ShopStep(driver);
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkAuthorizationFormData(UserData userData) {
        authorizationFormStep.enterEmail(userData.getEmail());
        authorizationFormStep.enterPassword(userData.getPassword());
        authorizationFormStep.clickSubmitButton();
        Assert.assertTrue(authorizationFormStep.getUserEmail());

        shopStep.clickShopButton();

    }
}
