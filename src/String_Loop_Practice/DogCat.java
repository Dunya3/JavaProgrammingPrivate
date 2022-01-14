package String_Loop_Practice;
import java.util.Scanner;
public class DogCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

         int dogs = 0;
         int cats = 0;

        for (int i = 0; i < sentence.length()-2; i++) {
            String cat = sentence.substring(i, i + 3);
            String dog = sentence.substring(i, i + 3);
        if (cat.equalsIgnoreCase("cat")){
            cats ++;

        }if (dog.equalsIgnoreCase("dog")){
            dogs ++;
            }
        }
        boolean catDog = cats == dogs;
        System.out.println(catDog);
}}
/*
5.Write a program to print true if the string "cat" and "dog" ,
appear the same number of times in the given sentence.

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */