import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends pages.BasePage {
    By loginPageLocator = By.className("user-login");
    By findEmailLocator = By.id("inputEmailDiv");
    //By findPasswordLocator = By.className("ym-disable-keys TLeaf-Mask input-validation-error");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /*public void email() {

    }

    public void password() {
    }*/

    public boolean isOnLoginPage() throws InterruptedException {
        Thread.sleep(2000);
        return isDisplayed(loginPageLocator);
    }
}
