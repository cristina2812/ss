package page;

import models.UserGuest;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("http://qa2.dev.evozon.com/checkout/onepage/")
public class CheckoutPage extends AbstractPage {

    @FindBy (css = "#onepage-guest-register-button")
    private WebElementFacade checkOutAsGuestButton;

    @FindBy (id = "billing:firstname")
    private WebElementFacade billingFristName;

    @FindBy (id = "billing:lastname")
    private WebElementFacade billingLastName;

    @FindBy (id = "billing:email")
    private WebElementFacade billingEmail;

    @FindBy (id = "billing:city")
    private WebElementFacade billingCity;

    @FindBy (id ="billing:postcode")
    private WebElementFacade billingZipCode;

    @FindBy (id = "billing:telephone")
    private WebElementFacade billingPhoneNumber;

    @FindBy (id = "billing:region_id")
    private WebElementFacade billingState;

    @FindBy (id = "billing:country_id")
    private WebElementFacade billingCountry;

    @FindBy (id = "billing:street1")
    private WebElementFacade billingAddress;

    @FindBy (id = "billing:use_for_shipping_no")
    private WebElementFacade shipToDifferentAddressOption;

    @FindBy (id = "billing-buttons-container")
    private WebElementFacade continueButtonFromBillingInformationCheckout;




    public void clickCheckOutAsGuestButton() {
        checkOutAsGuestButton.click();
    }

    public void typeFirstName(String firstName) {
        billingFristName.type(firstName);
    }

    public void typeLastName(String lastName) {
        billingLastName.type(lastName);
    }

    public void typeEmail(String email) {
        billingEmail.type(email);
    }

    public void typeCity(String city) {
        billingCity.type(city);
    }

    public void typeZipCode(String zipCode){
        billingZipCode.type(zipCode);
    }

    public void typePhoneNumber(String phoneNumber) {
        billingPhoneNumber.type(phoneNumber);
    }

    public String selectRegion(String region) {
       region = billingState.selectByValue("291");
       return region;
    }

    public String selectCountry(String country){
        country = billingCountry.selectByValue("RO");
        return country;
    }

    public void typeAddress(String address) {
        billingAddress.type(address);
    }

    public void selectshipToDifferentAddressOption() {
        shipToDifferentAddressOption.click();
    }

    public void clickContinueButtonFromBillingInformationCheckout() {
        continueButtonFromBillingInformationCheckout.click();
    }








}
