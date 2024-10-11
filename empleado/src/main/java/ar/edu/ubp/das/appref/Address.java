package ar.edu.ubp.das.appref;

public class Address {
    private String city;
    private String street;
    private String streetNumber;

    public Address(String city, String street, String streetNumber){
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public String getCompleteAddress() {
        return city + " - " + street + ", " + streetNumber;
    }

    public void updateAddress(String newCity, String newStreet, String newstreetNumber) {
        this.city = newCity;
        this.street = newStreet;
        this.streetNumber = newstreetNumber;
    }
   
}
