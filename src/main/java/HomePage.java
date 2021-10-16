package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends pages.BasePage {

    pages.SearchBox searchBox ;
    By cartCountLocator = By.id("spanCart cart-item-count header-cart-quantity");
    By cartContainerLocator = By.xpath("/html/body/div[5]/div[2]/div[1]/div[4]/div/div[4]/a");
   /* By loginButtonLocator = By.className("//*[@id=\"header__container\"]/div/header/div[2]/div/div[3]/div[2]/div[1]/a");

    public void loginButton()
    {
        click(loginButtonLocator);
    }*/

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new pages.SearchBox(driver);
    }

    public pages.SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() throws InterruptedException {
        click(cartContainerLocator);
        Thread.sleep(2000);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }


}