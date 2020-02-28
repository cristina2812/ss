package test;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;

import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import steps.FooterSteps;


@RunWith(SerenityParameterizedRunner.class)

@UseTestDataFrom(value = "D:\\Echipa1\\src\\test\\resources\\csv\\advancedSearch.csv")

public class FooterTestDDT extends BaseTest {


        @Steps
        FooterSteps footerSteps;

        private String name, description, priceFrom, priceTo, selectColour, selectSize, selectGender, searchResult;

        @Test
        public void testSearchDDT() {

            footerSteps.clickOnFooterLink("Advanced Search");

            footerSteps.fillFieldsDDT(name, description, priceFrom, priceTo, selectColour, selectSize, selectGender);

            footerSteps.searchButton();

            footerSteps.shouldReturnResult(searchResult);

        }

    }

