package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.HeaderPage;

public class HeaderSteps {

    HeaderPage headerPage;

    @Step
    public void showPageTitle(String title){
        headerPage.getGreetMessage();
        Assert.assertEquals(headerPage.getPageTile(), title);
    }

    @Step
    public void showWebUrl(String url){
        Assert.assertEquals(headerPage.getSiteUrl(), url);
    }

    @Step
    public void showLogo(String url){
        Assert.assertTrue(headerPage.seeIfLogoIsDisplayed());
        headerPage.clickOnLogo();
        Assert.assertEquals(headerPage.getSiteUrl(), url);

    }

    @Step
    public void checkIfAccountIsDisplayed(){
        headerPage.clickOnAccountDropdown();
        Assert.assertTrue(headerPage.seeIfAccountListIsDIsplayed());
        Assert.assertEquals(headerPage.seeAccount(), "ACCOUNT");
    }

    @Step
    public void checkIfLanguageChanged(){
        headerPage.selectLanguageValue();
    }

    @Step
    public void checkSizeLanguageOption(){
        int sizeLanguage = headerPage.sizeOptionLanguage();
        Assert.assertEquals(3,sizeLanguage);
    }

    @Step
    public void insertKeywordInSearchField(){
        headerPage.changeFieldSearch();
        String getinsertInFieldSearch = headerPage.getSearchField();
        headerPage.clickSearchBtn();
        String getPageTitleSearch =  headerPage.getPageTitleSearch();
        Assert.assertTrue(getPageTitleSearch.contains(getinsertInFieldSearch));
    }


}
