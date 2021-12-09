package Lab_3.task_1;

import java.util.Objects;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private int houseNumber;

    public Address(){

    }

    /*
    public Address(final String country, final String region, final String city, final String street, final int houseNumber) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;

    }*/


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(final int houseNumber) {
        this.houseNumber = houseNumber;
    }




    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Address address = (Address) o;

        return Objects.equals(country, address.country) && Objects.equals(region, address.region) && Objects.equals(city, address.city) && Objects.equals(street, address.street) && houseNumber == address.houseNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, region, city, street, houseNumber);
    }

    @Override
    public String toString() {
        return "Address: " + getCountry() + ", " + getRegion() + " region, " + getCity() + ", " + getStreet() + " street, " + getHouseNumber();
    }
}
