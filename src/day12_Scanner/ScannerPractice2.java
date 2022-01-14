package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println("Enter true or False");
       // boolean result = input.hasNextBoolean();

        System.out.println("Enter your name");
        String name = input.next();// Java Programing

        System.out.println("name = " + name); //java



        input.close();

    }
}
