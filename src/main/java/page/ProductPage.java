package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;


@DefaultUrl("http://qa2.dev.evozon.com/khaki-bowery-chino-pants.html")
public class ProductPage extends AbstractPage {
    @FindBy(css = "ul#configurable_swatch_color li")
    private List<WebElementFacade> colorList;

    @FindBy(css = "ul#configurable_swatch_size li")
    private List<WebElementFacade> customSize;

//    public int getColorListSize() {
//        return colorList.size();
//    }



}
