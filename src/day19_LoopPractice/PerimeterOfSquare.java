package day19_LoopPractice;
import java.util.Locale;
import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
        System.out.println("Enter the side of the circle: ");
        double side = input.nextDouble();
        double areaOfSquare = 0;
        double perimeterOfSquare = 0;

        if (side <= 0){
            System.err.println("Ivalid Entry for the side of the square");
            System.exit( 0);

        }
       if (side > 0){
           areaOfSquare = side * 4;
           perimeterOfSquare = side * 4;
           System.out.println("areaOfSquare = " + areaOfSquare);
           System.out.println("perimeterOfSquare = " + perimeterOfSquare);

       }

        System.out.println("Would you like to calculate another Square?");
        String yesNo = input.next().toLowerCase();
        while (!(yesNo.equals("yes") || yesNo.equals("no"))) {
            System.out.println("Invalid entry!");
            yesNo = input.next().toLowerCase();

        }
        if (yesNo.equals("no")){
            System.out.println("Thak you for using Cydeo Square Calculator APP");
           break;
        }
    }
}}
/*
Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task

 */