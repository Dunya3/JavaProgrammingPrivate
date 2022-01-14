package Practice_If_Nef_Trn;

public class AgeGroupNIf {
    public static void main(String[] args) {
        int age = 75;
        String results = "";

        if (age >= 55 && age <= 150) {

            if (age <= 21) {
                results = "Teenager";
            } else if (age <= 21 && 55 <= age) {
                results = "Adult";
            } else {
                results = "Senior";
            }

        } else {
            results = "Invalid";
        }
        System.out.println(results);

    }}


/*
4. Create a class called AgeGroups,
 write a program that can define the age groups of a person.

            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */