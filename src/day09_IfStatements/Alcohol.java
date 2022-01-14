package day09_IfStatements;

public class Alcohol {
    public static void main(String[] args) {

        String name = "Dunja";
        int age = 18;

        boolean isEligible = age >= 21;


        if (isEligible) {
            System.out.println(name + " is eligible to buy alcohol");
        } else {
            System.out.println(name + " is Not eligible to buy alcohol");


        }
    }

}

/*
3. Write a program that can check if the person is eligible to buy alcohol?
 */
