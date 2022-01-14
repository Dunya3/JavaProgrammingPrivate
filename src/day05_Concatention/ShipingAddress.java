package day05_Concatention;

public class ShipingAddress {

    public static void main(String[] args) {

        /*...*/
        String name = "Dunja Beric",
                buildingNumber = "1182",
                streetName = "4001 9th North",
                city = "McLean",
                state = "VA",
                zipCode = "22203";
        /*...*/


        //  System.out.println(name + "\n" + buildingNumber + " " + streetName +"\n" + city +", " + state +" " + zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);


    }
    }

    /*
    Create a class called ShippingAddress.java
    Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode

  Use concatenation to print the full shipping address

}

/* Example:
Dunja Beric
1182 4001 9th North
McLean, VA 22203
 */