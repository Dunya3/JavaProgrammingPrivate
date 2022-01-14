package day19_LoopPractice;
import java.util.Scanner;
public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the length of the Rectangle");
            double area = input.nextDouble();
            double areaOfRectangle = 0;
            double perimeterOfRectangle = 0;

            if (area <= 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);


            }
            if (area > 0) {
                areaOfRectangle = area * area * 2;
                perimeterOfRectangle = 2 * area;
                System.out.println("areaOfRectangle = " + areaOfRectangle);
                System.out.println("perimeterOfRectangle = " + perimeterOfRectangle);
            }

            System.out.println("Would you like to calculate another Rectangle?");
            String yesNo = input.next().toLowerCase();
            while (!(yesNo.equals("yes") || yesNo.equals("no"))) {
                System.out.println("repeat the previous steps");
            }
            if (yesNo.equals("no")) {
                System.out.println("Thank you for using Rectangle Calculator APP");
                break;
            }

        }
    }}
/*
3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task

 */