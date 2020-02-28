package page;

import factory.SubCategoryFactory;
import models.SubCategory;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import static org.hamcrest.CoreMatchers.is;


public class HeaderPage extends AbstractPage {

    @FindBy(css = "p.welcome-msg")
    private WebElementFacade greetMessage;

    @FindBy(css = "head > title")
    private WebElementFacade nameTitle;

    @FindBy(css = ".logo")
    private WebElementFacade pageLogo;

    @FindBy(css = ".skip-account")
    private WebElementFacade accountDropdownButton;

    @FindBy(css = "#header-account")
    private WebElementFacade accountDropdownList;

    @FindBy(id = "select-language")
    private WebElementFacade languageDropdown;

    @FindBy(css = "#select-language > option")
    private List<WebElementFacade> optionLanguageDropDown;

    @FindBy(css = "#search")
    private WebElementFacade insertInFieldSearch;

    @FindBy(css = ".button.search-button")
    private WebElementFacade searchBtn;

    @FindBy(css = ".page-title")
    private WebElementFacade getPageTitleSearch;

    @FindBy(css = ".level0.parent")
    private List<WebElementFacade> getheaderTitles;

    @FindBy(css = ".level0.nav-5")
    private WebElementFacade clickOnSpecificTitle;

    @FindBy(css = ".button btn-cart")
    private WebElementFacade clickToAddtocart;

    @FindBy(css = ".nav-primary")
    private List<WebElementFacade> getMainNavigationOptions;

    @FindBy(css = ".level0.nav-1.parent")
    private List<WebElementFacade> getWomenSubcategoryOptions;


    @FindBy(css = "#header-account > div > ul > li.last > a")
    private WebElementFacade loginHeaderBtn;

    @FindBy(css = ".level0.nav-2.parent")
    private List<WebElementFacade> getMenSubcategoryOptions;

    @FindBy(css = ".level0.nav-3.parent")
    private List<WebElementFacade> getAccesoriesSubcategoryOptions;

    @FindBy(css = ".level0.nav-4.parent")
    private List<WebElementFacade> getHomeOptions;

    @FindBy(css = ".level0.nav-5.parent")
    private List<WebElementFacade> getSaleOptions;

    @FindBy(css = ".level0.nav-6.last")
    private List<WebElementFacade> getVipOptions;


    public String getGreetMessage() {
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(greetMessage);
        return greetMessage.getText();
    }

    public String getPageTile() {
        return getDriver().getTitle();

    }

    public String getSiteUrl() {

        return getDriver().getCurrentUrl();
    }

    public boolean seeIfLogoIsDisplayed() {

        return pageLogo.isDisplayed();
    }

    public void clickOnLogo() {

        pageLogo.click();
    }

    public void clickOnAccountDropdown() {

        accountDropdownButton.click();
    }

    public boolean seeIfAccountListIsDIsplayed() {

        return accountDropdownList.isDisplayed();
    }

    public String seeAccount() {
        return accountDropdownButton.getText();
    }

    public void selectLanguageValue() {
        languageDropdown.selectByVisibleText("French");
        Assert.assertThat(languageDropdown.getSelectedVisibleTextValue(), is("French"));
    }

    public int sizeOptionLanguage() {
        return optionLanguageDropDown.size();
    }

    public void changeFieldSearch(String keyword) {
        insertInFieldSearch.sendKeys(keyword);
    }

    // used for DDT
    public String getSearchField() {
        return insertInFieldSearch.getText();
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public String getPageTitleSearch() {
        return getPageTitleSearch.getText().toLowerCase();

    }

    public void getHeaderTitles() {
        for (WebElementFacade list : getheaderTitles) {
            System.out.println(list.getText());
        }
    }

    public void clickOnSpecificTitle() {

        clickOnSpecificTitle.click();
    }

    public void clickOnLoginHeader() {
        loginHeaderBtn.click();
    }

    public void getMainNavigationOptions() {
        for (WebElementFacade list : getMainNavigationOptions) {
            System.out.println(list.getText());
        }
    }

    public void checkWomenSubcategory() {
        Actions actions = new Actions(getDriver());
        WebElement womenCategory = getDriver().findElement(By.xpath("//ol/li/a[text()='Women']"));
        System.out.println("efewfwe");
        actions.moveToElement(womenCategory).build().perform();
        System.out.println("asdf");
        for (WebElementFacade list : getWomenSubcategoryOptions) {
            System.out.println(list.getText());
        }

    }

    public void clickMenSubcategory() {
        Actions actions = new Actions(getDriver());
        WebElement menCategory = getDriver().findElement(By.cssSelector("li.level0.nav-2.parent"));
        actions.moveToElement(menCategory);
        WebElement menSubCategory = getDriver().findElement(By.cssSelector(".level1.nav-2-2"));
        actions.moveToElement(menSubCategory).build().perform();
        actions.click().build().perform();
    }

    public void checkMenSubcategory() {
        Actions actions = new Actions((getDriver()));
        WebElement menCategory = getDriver().findElement(By.cssSelector(".level0.nav-2.parent"));
        actions.moveToElement(menCategory).build().perform();
        for (WebElementFacade list : getMenSubcategoryOptions) {
            System.out.println(list.getText());
        }
    }

    public void checkAccesoriesSubcategory() {
        Actions actions = new Actions(getDriver());
        WebElement accesoriesCategory = getDriver().findElement(By.cssSelector(".level0.nav-3.parent"));
        actions.moveToElement(accesoriesCategory).build().perform();
        for (WebElementFacade list : getAccesoriesSubcategoryOptions) {
            System.out.println(list.getText());
        }
    }

    public void checkHomeSubcategory() {
        Actions actions = new Actions(getDriver());
        WebElement homeCategory = getDriver().findElement(By.cssSelector(".level0.nav-4.parent"));
        actions.moveToElement(homeCategory).build().perform();
        for (WebElementFacade list : getHomeOptions) {
            System.out.println(list.getText());
        }
    }

    public void checkSaleSubcategory() {
        Actions actions = new Actions(getDriver());
        WebElement saleCategory = getDriver().findElement(By.cssSelector(".level0.nav-5.parent"));
        actions.moveToElement(saleCategory).build().perform();
        for (WebElementFacade list : getSaleOptions) {
            System.out.println(list.getText());
        }
    }

    public void checkVipSubcategory() {
        Actions action = new Actions(getDriver());
        WebElement vipCategory = getDriver().findElement(By.cssSelector(".level0.nav-6.last"));
        action.moveToElement(vipCategory).build().perform();
        for (WebElementFacade list : getVipOptions) {
            System.out.println(list.getText());
        }
    }

    /*public void clickMenSubcategoryDDT() {
        SubCategoryFactory subCategoryFactory = new SubCategoryFactory();
        SubCategory subCategory = subCategoryFactory.getSubCategory();

        Actions actions = new Actions(getDriver());
        WebElement menCategory = getDriver().findElement(By.cssSelector("li.level0.nav-2.parent"));
        actions.moveToElement(menCategory);

        // sub category
        WebElement menSubCategory = getDriver().findElement(By.cssSelector(".level1.nav-2-2"));
        actions.moveToElement(menSubCategory).build().perform();
        subCategory.getSubcategoryName();
        System.out.println(subCategory.getSubcategoryName()+" tfdadgfigadugauisdgduigdgasjdgasgud");
        actions.click().build().perform();
    }*/
}


