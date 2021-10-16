package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchBox extends pages.BasePage {


    By searchBoxLocator = By.id("search_input");
    By submitButtonLocator = By.className("searchButton");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    /*
    Eger sayfada bekletilmezse sonucu hemen bulamadigi icin hata veriyor
    ve bu yuzden genellikle Thread.sleep kullanmak zorunda kaldim.
    Ayrica clear kullanma sebebim ise, default olan yaziyi silmeden arama yapildiginda,
    dogru sonuc elde edilmiyordu.
     */
    public void search(String text) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.id("search_input")).clear();
        type(searchBoxLocator , text);
        click(submitButtonLocator);
    }
}