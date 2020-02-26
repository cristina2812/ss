package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.time.Duration;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;


public class HeaderPage extends AbstractPage{

    @FindBy(css="p.welcome-msg")
    private WebElementFacade greetMessage;

    @FindBy(css = "head > title")
    private WebElementFacade nameTitle;

    @FindBy(css=".logo")
    private WebElementFacade pageLogo;

    @FindBy(css=".skip-account")
    private WebElementFacade accountDropdownButton;

    @FindBy(css="#header-account")
    private WebElementFacade accountDropdownList;

    @FindBy(id="select-language")
    private WebElementFacade languageDropdown;

    @FindBy(css="#select-language > option")
    private List<WebElementFacade> optionLanguageDropDown;

    @FindBy(css="#search")
    private WebElementFacade insertInFieldSearch;

    @FindBy(css=".button.search-button")
    private WebElementFacade searchBtn;

    @FindBy(css=".page-title")
    private WebElementFacade getPageTitleSearch;

    @FindBy(css = ".level0.parent")
    private List<WebElementFacade> getheaderTitles;

    @FindBy(css=".level0.nav-5")
    private WebElementFacade clickOnSpecificTitle;


    public String getGreetMessage(){
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(greetMessage);
        return greetMessage.getText();
    }

    public String getPageTile(){
        return getDriver().getTitle();

    }

    public String getSiteUrl(){
        return getDriver().getCurrentUrl();
    }

    public boolean seeIfLogoIsDisplayed(){
        return pageLogo.isDisplayed();
    }

    public void clickOnLogo(){
        pageLogo.click();
    }

    public void clickOnAccountDropdown(){
        accountDropdownButton.click();
    }

    public boolean seeIfAccountListIsDIsplayed() {
        return accountDropdownList.isDisplayed();
    }
    public String seeAccount(){
        return accountDropdownButton.getText();
    }
    public void selectLanguageValue(){
        languageDropdown.selectByVisibleText("French");
        Assert.assertThat(languageDropdown.getSelectedVisibleTextValue(), is("French"));
    }

    public int sizeOptionLanguage(){
        return optionLanguageDropDown.size();
    }

    public void changeFieldSearch(String keyword) {
        insertInFieldSearch.sendKeys(keyword);

    }

    public String getSearchField(){
        return insertInFieldSearch.getText();
    }

    public void clickSearchBtn(){
        searchBtn.click();
    }

    public String getPageTitleSearch() {
        return getPageTitleSearch.getText().toLowerCase();

    }

    public void getheaderTitles() {
        for (WebElementFacade list : getheaderTitles) {
            System.out.println(list.getText());
        }
    }

    public void clickOnSpecificTitle(){
        clickOnSpecificTitle.click();
    }

}
