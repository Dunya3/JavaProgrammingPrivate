package day05_Concatention;

public class FullName {


    public static void main(String[] args) {

        String firstName = "Dunja";
        String lastName = "Beric";
        int age = 45;
        String jobTitle = "SDET";
        String CompanyName = "Google";
        int salary = 1200000;
        String fullName = firstName + " " + lastName;
        //Full name of the person is _____
        System.out.println("Full name of the preson is " + fullName);

        //_____ is___ years old

        System.out.println(fullName + " is " + age +" Years old " );

       //day05_.FullName is JobTitle, + works at + CompanyName

        System.out.println(fullName + "is" + jobTitle +", works at" + " companyName " + "" +
                "+,and "+fullName +"'s salary is $"+salary);



    }



}
