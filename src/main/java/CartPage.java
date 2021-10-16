package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends pages.BasePage {

    By increaseNumberLocator=By.xpath("//*[@id=\"Cart_AddQuantity_686083897\"]");
    By deleteContainLocator = By.className("col-md-4 col-xs-3 text-right sc-option-detail pl-0");
    By deleteProductLocator = By.xpath("//*[@id=\"Cart_ProductDelete_686132236\"]");
    By deleteTrashLocator = By.xpath("//*[@id=\"Cart_ProductDelete_686083897\"]");

    public CartPage(WebDriver driver) {
        super(driver);
    }



  /*  public void increaseNumber() throws InterruptedException {

        Thread.sleep(2000);
        click(increaseNumberLocator);
        Thread.sleep(2000);

    }*/

    public void deleteProduct() throws InterruptedException {
        click(deleteContainLocator);
        Thread.sleep(2000);
        click(deleteProductLocator);
        Thread.sleep(2000);
        click(deleteTrashLocator);
        Thread.sleep(2000);
    }
}