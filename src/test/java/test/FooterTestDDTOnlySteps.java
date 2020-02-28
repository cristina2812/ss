package test;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.FooterSteps;
import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

import java.io.IOException;

@RunWith(SerenityRunner.class)
public class FooterTestDDTOnlySteps extends BaseTest{


    @Steps
    private FooterSteps footerSteps;


    @Test
    public void testSearchDDTOnlySteps() throws IOException {
        footerSteps.clickOnFooterLink("Advanced Search");
        withTestDataFrom("D:\\Echipa1\\src\\test\\resources\\csv\\advancedSearch.csv").run(footerSteps).fillAndSearch();

    }

}
