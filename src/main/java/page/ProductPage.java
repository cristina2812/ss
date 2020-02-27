package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;
import java.util.Random;


@DefaultUrl("http://qa2.dev.evozon.com/khaki-bowery-chino-pants.html")
public class ProductPage extends AbstractPage {

    @FindBy(css = "ul#configurable_swatch_color li")
    private List<WebElementFacade> colorList;

    @FindBy(css = "ul#configurable_swatch_size li")
    private List<WebElementFacade> customSize;


    @FindBy(css=".add-to-cart-buttons")
    private WebElementFacade addToCartButton;

    @FindBy(css = "div.product-name > span")
    private WebElementFacade productName;

    public int getColorListSize() {
        return colorList.size();
    }

    public void getRandomProperties() {
        Random rand = new Random();
        WebElementFacade randomColor = colorList.get(rand.nextInt(colorList.size()));
        randomColor.click();
        WebElementFacade randomSize = customSize.get(rand.nextInt(customSize.size()));
        randomSize.click();
    }

    public void addToCart(){
        addToCartButton.click();
    }

    public String getProductName() {
        String name = productName.getText();
        return name;
    }
}
