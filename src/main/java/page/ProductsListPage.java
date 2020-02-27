package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsListPage extends AbstractPage {

    Random rand = new Random();

    @FindBy(css = "div.category-products li.item > a")
    private List<WebElementFacade> randomProductFromList;

    @FindBy(css = "div.category-products li.item")
    private List<WebElementFacade> getRandomProductContainer;


    public WebElement getRandomProductContainer(){
        return getRandomProductContainer.get(rand.nextInt(getRandomProductContainer.size()));
}

    public void clickOnRandomProductFromList() {
        WebElementFacade randomProd = randomProductFromList.get(rand.nextInt(randomProductFromList.size()));
        randomProd.click();
    }
}
