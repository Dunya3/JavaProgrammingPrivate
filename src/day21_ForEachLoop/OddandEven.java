package day21_ForEachLoop;

import java.util.Arrays;

public class OddandEven {
    public static void main(String[] args) {

       int[] numbers ={ 2, 4, 6, 8, 10, 11, 12, 13, 14};
       int i =0;
       int j =0;

        for (int each:numbers) {
            if (each % 2 == 0){
                i++;
            }
        }

        for (int each : numbers) {
            if (each % 2 == 1){
                j++;
            }

        }

        System.out.println("Enter number: " + i);
        System.out.println("Enter number: " + j);



    }

}
/*
 Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */