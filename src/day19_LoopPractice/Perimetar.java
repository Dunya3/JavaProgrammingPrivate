package day19_LoopPractice;
import java.util.Scanner;
public class Perimetar {
    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);


                while (true) {
                    System.out.println("Enter the radius of the circle: ");
                    double radius = input.nextDouble();
                    double diameter = 0;
                    double area = 0;
                    double perimeter = 0;

                    if (radius <= 0) {
                        System.err.println("Invalid Entry for radius");
                        System.exit(0);
                    }
                    if (radius > 0) {
                        area = radius * radius * 3.14;
                        perimeter = 2 * radius * 3.14;
                        diameter = radius * 2;
                        System.out.println("perimeter = " + perimeter);
                        System.out.println("area = " + area);
                        System.out.println("diameter = " + diameter);
                    }


                    System.out.println("Would you like to calculate another circle?");
                    String yesNo = input.next().toLowerCase();
                    while (!(yesNo.equals("yes") || yesNo.equals("no"))) {
                        System.out.println("Invalid entry!");
                        yesNo = input.next().toLowerCase();
                    }
                    if(yesNo.equals("no")){
                        System.out.println("Thank you for using Cydeo Circle Calculator APP");
                        break;
                    }


                }


            }}






/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers,
				 terminate the program after displaying
				 the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle
			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task
 */