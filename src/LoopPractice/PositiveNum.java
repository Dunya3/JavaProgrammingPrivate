package LoopPractice;
import java.util.Scanner;
public class PositiveNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scan.nextInt();
        System.out.println("enter second number");
        int num2 = scan.nextInt();

       int multiplication =0;
       int division = 0;

        for (int i = 1; i < num2; i++) {
            multiplication += num1;


        }
        while (num1 >= num2){
            num1 = num1 - num2;
            division++;

        }
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = + " + division);
    }
}
/*
.Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.

 */