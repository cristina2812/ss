package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AbstractPage  extends PageObject {

    public WebElement getLinkWithText (String text) {
        return getDriver().findElement(By.xpath("//a[text()='"+text+"']"));
    }

}
