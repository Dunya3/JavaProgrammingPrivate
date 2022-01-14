package day09_IfStatements;

public class MiniNumber {

    public static void main(String[] args) {

        int n1= 100,
               n2= 200;

       /* if (n1 < n2){ // in future easier way
            System.out.println(n1+" is the minimum number");
            */


        boolean n1isMin = n1 < n2;
        boolean n2isMin =  n2 < n1;
        boolean equal = n1 == n2;

        if (n1isMin){ // if n1 is minimum number
            System.out.println(n1+" is the minimum number");
        }

        if (n2isMin){ // if n2 is the minimum number
            System.out.println(n1+" is the minimum number");
        }

        if (equal) { // if n1 is equal to n2
            System.out.println("Equal");
        }








    }
















    /*
    1. Create a class called MinNumber,
    Write a program that can print the minimum number between two numbers,
     if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number


     */
}
