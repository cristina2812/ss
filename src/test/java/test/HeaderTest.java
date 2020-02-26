package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.ProductsListPage;
import steps.HeaderSteps;
import steps.ProductSteps;


@RunWith(SerenityRunner.class)
public class HeaderTest extends BaseTest {

    @Steps
    HeaderSteps headerSteps;


    @Test
    public void getPageTitleTest() {
        headerSteps.showPageTitle("Madison Island");
    }

    @Test
    public void getPageUrlTest() {
        headerSteps.showWebUrl("http://qa2.dev.evozon.com/");
    }

    @Test
    public void showClickLogoTest() {
        headerSteps.showLogo("http://qa2.dev.evozon.com/");
    }

    @Test
    public void seeIfAccountIsDisplayedTest() {
        headerSteps.checkIfAccountIsDisplayed();
    }

    @Test
    public void changeLanguageTest() {
        headerSteps.checkIfLanguageChanged();
    }

    @Test
    public void checkSizeLanguageTest() {
        headerSteps.checkSizeLanguageOption();
    }

    @Test
    public void checkSearchTest() {
        headerSteps.insertKeywordInSearchField("woman");
    }

    @Test
    public void headerTitlesTest() {
        headerSteps.checkHeaderTitles();
    }

}

