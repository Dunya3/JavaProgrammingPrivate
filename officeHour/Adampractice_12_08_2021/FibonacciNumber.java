package Adampractice_12_08_2021;
import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //ovaj je mnogo mnogo vazan zadatak za intervju
        System.out.println("How many fibonacci number do to you want to see");
        int number = input.nextInt();
        int num1 =0; // zato sto sistem kaze start od 1 i 2 dolazi sa frabici pravilom zato smo dali ove int -e
        int num2 =1;
        int result=0;

        System.out.println(num1);  //moramo prvo da printamo ovde u slucaju fibonaci da bi videli
        System.out.println(num2);

        for (int i=2;i<number;i++) { //ovde smo stavili 2 jer vec imamo 0 i 1 i intevima a treba da vidimo 8(tj9 sa 8 koje ukucamo) brojeva u outputu kad kucamo 8
            result=num1+num2;  // 0+1=1
            System.out.println(result);
            num1=num2; //num1=1
            num2=result; //num2=1
        }

    }
}
/* Create a program that will give you the Fibonacci numbers up to the x value.

                           Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                           Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                          Ex:
                             Input:
                               8
                             Output:
                               0, 1, 1, 2, 3, 5, 8, 13, 21

                         */