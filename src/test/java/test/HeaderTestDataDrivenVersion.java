package test;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HeaderSteps;
import steps.ProductsListSteps;

import static utils.Constants.CSV_FILES_PATH;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = CSV_FILES_PATH +  "SearchByKeyword.csv")
public class HeaderTestDataDrivenVersion extends BaseTest{

    private String searchKeyword, searchResult;
    boolean shouldBeFound;

    @Steps
    HeaderSteps headerSteps;
@Steps
    ProductsListSteps productsListSteps;
    @Test
    public void getSubCategoriesFromCategories() {

        headerSteps.insertKeywordInSearchFieldDDT(searchKeyword);
        productsListSteps.checkIfProductIsPresentOrNot(searchResult,shouldBeFound);

    }


}
