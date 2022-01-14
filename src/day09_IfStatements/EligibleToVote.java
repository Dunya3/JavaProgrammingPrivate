package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        int age = 22;
        String citizen = "USA";
        if (age >= 18 && citizen == "USA") {
            System.out.println("Is eligible to vote");
        } else {
            System.out.println("Is not eligible to vote");


        }
    }
}


/*
Write a program that can check if the person is eligible to vote?
 */