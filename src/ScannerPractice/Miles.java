package ScannerPractice;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles");
        double miles = input.nextDouble();



        double results = miles * 1.609344;

        System.out.println(miles + "miles equal to" + results + "kilometers");



         input.close();






    }
}
/*
 Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */