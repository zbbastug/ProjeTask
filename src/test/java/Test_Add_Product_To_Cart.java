import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CartPage;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.ProductsPage;

public class Test_Add_Product_To_Cart extends BaseTest {

    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;
    LoginPage loginPage;

    /*@Test
    public void login() throws InterruptedException {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        homePage.loginButton();
        Thread.sleep(5000);

        /*loginPage.email();
        Thread.sleep(5000);
        loginPage.password();
        Thread.sleep(5000);
        Assertions.assertTrue(loginPage.isOnLoginPage() ,
                "Not on login page!");

    }*/

    @Test
    @Order(1)
    public void search_a_product() throws InterruptedException {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Pantolon");
        Thread.sleep(2000);
        productsPage.scroll();
        Assertions.assertTrue(productsPage.isOnProductPage() ,
                "Not on products page!");
    }

    @Test
    @Order(2)
    public void select_a_product() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");
    }

    @Test
    @Order(3)
    public void add_product_to_cart() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        Thread.sleep(2000);
        productDetailPage.sizeOption();
        Thread.sleep(2000);
        productDetailPage.addToCart();
    }

    @Test
    @Order(4)
    public void go_to_cart() throws InterruptedException {
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Thread.sleep(2000);
        /*cartPage.increaseNumber();
        Thread.sleep(2000);*/
        cartPage.deleteProduct();
        /*Assertions.assertTrue(cartPage.checkIfProductAdded() ,
                "Product was not added to cart!");*/
    }




}