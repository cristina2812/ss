package page;

import models.UserGuest;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.dev.evozon.com/checkout/onepage/")
public class CheckoutPage extends AbstractPage {

    @FindBy (css = "#onepage-guest-register-button")
    private WebElementFacade checkOutAsGuestButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingMethodradioBtn;

    @FindBy(css = "#shipping-method-buttons-container .button")
    private WebElementFacade continueShippingMethodBtn;

    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade paymentInformationBtn;

    @FindBy(css = "#review-buttons-container .button")
    private WebElementFacade placeOrderBtn;

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

    @FindBy (css = "#billing-buttons-container button[title = 'Continue']")
    private WebElementFacade continueButtonFromBillingInformationCheckout;

    @FindBy (id = "shipping:firstname")
    private WebElementFacade shippingFirstName;

    @FindBy (id = "shipping:lastname")
    private WebElementFacade shippingLastName;

    @FindBy (id = "shipping:street1")
    private WebElementFacade shippingAddress;

    @FindBy (id = "shipping:city")
    private WebElementFacade shippingCity;

    @FindBy (id = "shipping:country_id")
    private WebElementFacade shippingCountry;

    @FindBy (id = "shipping:telephone")
    private WebElementFacade shippingPhoneNumber;

    @FindBy (id = "shipping:postcode")
    private WebElementFacade shippingPostCode;

    @FindBy (id = "shipping:region_id")
    private WebElementFacade shippingRegion;

    @FindBy ( css = "#shipping-buttons-container button[title = 'Continue']")
    private WebElementFacade continueButtonFromShippingInformation;
    @FindBy ( css = ".btn-checkout")
    private WebElementFacade checkOutButton;

    @FindBy(css = "#opc-shipping > div.step-title > h2")
    private WebElementFacade shippingMethod;

    @FindBy(css="#billing\\:use_for_shipping_no")
    private WebElementFacade shipToDifferentOptionButton;

    @FindBy(css ="#billing\\:use_for_shipping_yes")
    private WebElementFacade shipToThisAddressLogin;

    @FindBy(css = "#billing-buttons-container > button")
    private WebElementFacade continueButtonShippingLogin;

    @FindBy(css ="#opc-shipping > div.step-title > h2")
    private WebElementFacade continueShippingInfoBtn;



    public void clickCheckOutAsGuestButton() {
        checkOutAsGuestButton.click();
    }

    public void clickRadioButtonFreeShipping(){
        freeShippingMethodradioBtn.click();
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

    public void selectRegion(String region) {
            billingState.selectByVisibleText(region);
    }


    public void selectCountry(String country){
        billingCountry.selectByValue(country);
    }

    public void typeAddress(String address) {
        billingAddress.type(address);
    }

    public void selectshipToDifferentAddressOption() {
        shipToDifferentAddressOption.click();
    }

    public void clickContinueButtonFromBillingInformationCheckout() {

        shipToDifferentOptionButton.click();
        continueButtonFromBillingInformationCheckout.click();
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(shippingFirstName);

    }
    public void clickShipToThisAddress() {

        shipToThisAddressLogin.click();
        continueButtonShippingLogin.click();

    }

    public void clickContinueShippingInfo(){
        continueShippingInfoBtn.click();
    }

    public void clickContinueShippingMethod(){
        continueShippingMethodBtn.click();
    }
    public void clickContinuePaymentInformation(){
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(paymentInformationBtn);
        paymentInformationBtn.click();
    }

    public void clickPlaceOrder(){
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(placeOrderBtn);
        placeOrderBtn.click();
    }
    public void clickCheckOutButton(){
        checkOutButton.click();
    }

    //////////////////////////////

    public void typeFirstNameInShipping(String firstName) {
        shippingFirstName.type(firstName);
    }

    public void typeLastNameInShipping(String lastName) {
        shippingLastName.type(lastName);
    }

    public void typeAddressInShipping(String address) {
        shippingAddress.type(address);
    }

    public void typeCityInShipping(String city) {
        shippingCity.type(city);
    }

    public void typeZipCodeInShipping(String zipCode){
        shippingPostCode.type(zipCode);
    }

    public void typePhoneNumberInShipping(String phoneNumber) {
        shippingPhoneNumber.type(phoneNumber);
    }

    public void selectRegionInShipping(String region) {
        shippingRegion.selectByVisibleText(region);
    }

    public void selectCountryInShipping(String country){
       shippingCountry.selectByValue(country);
    }

    public void clickContinueButtonFromShippingInformation() {
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(continueShippingInfoBtn);
        continueShippingInfoBtn.click();
    }


}

