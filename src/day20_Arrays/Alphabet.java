package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26]; // Z~A
                            //ascii table number of characters
        /*...
        alphabets[0] = 'Z';// 90
        alphabets[1] = 'Y';// 89
        alphabets[2] = 'X';// 88
        */

        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++,ch--) { //one way of doing it
            alphabets[i] = ch;

        }
        //System.out.println(alphabets); // moramo pretvoriti u arrays to string da bi printali
        System.out.println(Arrays.toString(alphabets));// print the whole array
        //System.out.println(alphabets[0]); // printing the element of array

        for (char i = 0,j = 'Z'; i < alphabets.length; i++, j++) { //i; index j:characters
            alphabets[i] = j;

            System.out.println(Arrays.toString(alphabets));
        }





    }
}
