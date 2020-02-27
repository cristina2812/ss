package models;

public class Product {

    private String name;
    private String description;
    private String priceFrom;
    private String priceTo;
    private String selectColour;
    private String selectSize;
    private String selectGender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
    }

    public String getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(String priceTo) {
        this.priceTo = priceTo;
    }

    public String getSelectColour() {
        return selectColour;
    }

    public void setSelectColour(String selectColour) {
        this.selectColour = selectColour;
    }

    public String getSelectSize() {
        return selectSize;
    }

    public void setSelectSize(String selectSize) {
        this.selectSize = selectSize;
    }

    public String getSelectGender() {
        return selectGender;
    }

    public void setSelectGender(String selectGender) {
        this.selectGender = selectGender;
    }
}
