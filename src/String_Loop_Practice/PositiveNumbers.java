package String_Loop_Practice;

import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;

        if (num >= 1) {//positive nums only

            for (int i = 1; i <= num2; i++) {
                result += num;
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid");//negative nums
        }


    }
}
/*









        
    }


}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

 */