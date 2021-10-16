package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.w3c.dom.html.HTMLImageElement;

import java.util.List;

public class ProductsPage extends pages.BasePage {

    By shippingOptionLocator = By.id("category-breadcrumb");
    By productNameLocator = By.className("product-item-info");
    By moreButtonLocator = By.className("lazy-load-button");
    By upButtonLocator = By.id("back-to-menu");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() throws InterruptedException {
        Thread.sleep(2000);
        return isDisplayed(shippingOptionLocator);
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    public void scroll() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        click(moreButtonLocator);
        Thread.sleep(2000);
        click(upButtonLocator);
    }

}