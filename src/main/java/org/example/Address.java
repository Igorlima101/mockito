package org.example;

public class Address {


    private String street;
    private String neighborhood;
    private String state;
    private String zipcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Address(String street, String neighborhood, String state, String zipcode) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.state = state;
        this.zipcode = zipcode;
    }


}
