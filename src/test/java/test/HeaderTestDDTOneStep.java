package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.ProductsListSteps;
import utils.Constants;

import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)
public class HeaderTestDDTOneStep extends BaseTest {
    @Steps
    private ProductsListSteps productsListSteps;

    @Test
    public void searchingByKeywordShouldDisplayTheCorrespondingArticleOnlySteps()
            throws IOException {
        withTestDataFrom(Constants.CSV_FILES_PATH+ "SearchByKeyword.csv")
                .run(productsListSteps).fillAndSearchWithResults();
    }
}
