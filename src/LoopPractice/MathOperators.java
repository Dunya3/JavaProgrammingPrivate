package LoopPractice;
import java.util.Scanner;
public class MathOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0);


        int results = 0;

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.out.println("Invalid operator. Please re-enter the operator");
            operator = scan.next().charAt(0);
        }
        if (operator == '+'){
        results = num1 + num2;

        }else if(operator == '-') {
            results = num1 - num2;
        }else if(operator == '*'){
            results = num1 * num2;
        }else if(operator == '/'){
            results = num1 / num2;
        }
        System.out.println("resutls = " + results);
        scan.close();

    }
}
/*
  3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */