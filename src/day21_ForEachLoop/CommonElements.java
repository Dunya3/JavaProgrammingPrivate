package day21_ForEachLoop;

import java.util.Arrays;

public class CommonElements {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int each : arr1) {
            for (int nums : arr2) {
                if (each == nums) {
                    System.out.println(each);
                }
            }
        }


    }}