package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
    // uglavnom bude na intervjuju
    

        String str1 = "acdbe";
        String str2 = "dbcaz";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        // write a program that can check if  str1 & str2 are build out same characters
        Arrays.sort(ch1);
        Arrays.sort(ch1);

        System.out.println();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("anagram = " + anagram); // ovo je ako su karakteri anagram onda je boolean true
                                                   // ako nisu kao sad onda dobijamo false




    }}
