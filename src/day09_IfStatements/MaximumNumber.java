package day09_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {

      int a = 200,
              b = 400;

      boolean maximumNum = a < b;
      boolean minimumNum = a > b;

      if (a<b) {
          System.out.println(b+ " is Maximum Number");
      }else{
          System.out.println(a+ " is Minimum Number");
          }
      }


}
/*
 Write a program that can print the maximum number between two numbers, if both are equal then print Equal.
*/
