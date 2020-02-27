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

    public int getColorListSize() {
        return colorList.size();
    }



    public void getRandomProperties() throws InterruptedException {
        getDriver().get("http://qa2.dev.evozon.com/men/shirts/plaid-cotton-shirt-476.html");

        Random rand = new Random();
        WebElementFacade randomColor = colorList.get(rand.nextInt(colorList.size()));

        randomColor.click();


        WebElementFacade randomSize = customSize.get(rand.nextInt(customSize.size()));

        System.out.println(customSize.size());
        System.out.println(randomSize.getText());
        randomSize.click();
        Thread.sleep(5000);
//        for(WebElementFacade list : customSize)
//        System.out.println(list.getText());
    }

    public void addToCart(){
        addToCartButton.click();
    }


}
