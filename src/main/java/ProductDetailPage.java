package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage extends pages.BasePage {

    By addToCartButtonLocator = By.id("pd_add_to_cart");
    By sizeButtonLocator = By.xpath("//*[@id=\"option-size\"]/a[1]");


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() throws InterruptedException {
        Thread.sleep(2000);
        return isDisplayed(addToCartButtonLocator);
    }


    public void sizeOption() {
        click(sizeButtonLocator);
    }
    public void addToCart() {
        click(addToCartButtonLocator);
    }

}