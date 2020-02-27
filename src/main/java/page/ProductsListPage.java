package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Random;

public class ProductsListPage extends AbstractPage {

    @FindBy(css = "div.category-products li.item > a")
    private List<WebElementFacade> randomProductFromList;


    public void clickOnRandomProductFromList() {
        Random rand = new Random();
        WebElementFacade randomProd = randomProductFromList.get(rand.nextInt(randomProductFromList.size()));
        randomProd.click();


    }
}
