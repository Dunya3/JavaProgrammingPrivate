package Aysunpractice_12_15_2021;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        /* Create a program that will give you the Fibonacci numbers up to the x value.
				           Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
			               Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
				          Ex:
				             Input:
				               8
				             Output:
				               0, 1, 1, 2, 3, 5, 8, 13
				               index       Values
				              0           0
				              1           1
				              2           1     index0+index1
				              3           2     index1+index2
				              4           3    index2+index3
				              5           5
				              6           8
				              7           13
				         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int number = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int result = 0;
//        Scanner input=new Scanner(System.in);
//        System.out.println("How many fibonacci number do you want to see?");
//        int number=input.nextInt();

//        int num0=0;
//        int num1=1;
//        int result=0;

//        System.out.println(num0);
//        System.out.println(num1);
//
//        for(int i=2;i<number;i++){
//            result=num0+num1; // 0+1=1
//            System.out.println(result);
//            num0=num1; //num1=1
//            num1=result; //num2=1
//        }

       /* int number1=6;

        System.out.println(num1);
        System.out.println(num2);
        int[] fibo= new int[number];

        fibo[0]=0;
        fibo[1]=1;

        for(int i=2;i<number;i++){
            result=num1+num2; // 0+1=1
            System.out.println(result);
            num1=num2; //num1=1
            num2=result; //num2=1
        }

            fibo[i]=fibo[i-1]+fibo[i-2];
        //  fibo[2]=fibo[1] + fibo[0] = 1
        //  fibo[3]=fibo[2] + fibo[1] = 1+1=2

    }
        System.out.println(Arrays.toString(fibo));

*/

    }}
/*
Practice Topics:
                     - Compare Loops : For Loop
                                       While Loop
                                       Do While Loop

                     - Array

                     - Swap 2 numbers , Fibonacci (Array)

                     - One of interview question they asked me


   Practices:
               1. Compare Loops


               2.

  (StringTimes)
                    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

                     input String : Hi  ,  input int : 2

                     output: HiHi



               3.

                       (SumOfEven_Odd)
                     Write a program using while loop, that calculates the sum of the even numbers between 0 and 10



                       4. Array Intro

                       5. Swap Two Numbers

                       6.

                      (Fibonacci)

				     Create a program that will give you the Fibonacci numbers up to the x value.

				     Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
			         Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

				         Ex:
				             Input:
				               8
				             Output:
				               0, 1, 1, 2, 3, 5, 8, 13, 21


                       6.   Interview Question


			          (MirrorEnds)

			         Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
                     In other words, zero or more characters at the very begining of the given string, and at the very end of the
                     string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

                            mirrorEnds("abXYZba") → "ab"
                            mirrorEnds("abca") → "a"
                            mirrorEnds("aba") → "aba"







 */
