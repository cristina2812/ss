package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductsListPage extends AbstractPage {

    @FindBy (id = "product-collection-image-549")
    private WebElementFacade clickOnSimpleProduct;

    public void clickOnSimpleProductPage() {
        clickOnSimpleProduct.click();
    }
}
