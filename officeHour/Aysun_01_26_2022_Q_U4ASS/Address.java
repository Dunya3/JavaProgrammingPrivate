package Aysun_01_26_2022_Q_U4ASS;

public class Address {

    private String street,city,state, zipCode;
    private final String country= "USA";

    public Address(){

    }

    public Address(String street, String city, String state, String zipCode) {
       setStreet(street);
       setState(state);
       setCity(city);
       setZipCode(zipCode);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.isEmpty() || street.length() > 50) {
            System.out.println("Error: Invalid Street");
        } else {
            this.street = street;
        }
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode.length() != 5) {
            System.out.println("Error: Invalid Street");
        } else { // mozemo uzeti else ili return; ovde ali vise je profesionalnije uzeti else
        //return; exsit statement ako if condition nije tacno // moze i system.exit
            this.zipCode = zipCode;
        }
    }
    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
    /*
            AddressTask

            Create a class named Address

            Private variables:
                    street, city, state, zipCode,country

            encapsulate all the fields

            add a constructor that can set all the instances
                  overload constr with no arg constr

            - if the street name isEmpty or street length is bigger than 50
             otherwise
                 ERROR : Invalid Street

            - ZipCode length should be equal 5 otherwise
                 ERROR :Invalid ZipCode

            DO NOT duplicate any code fragments
        */

