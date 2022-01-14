package day19_LoopPractice;
import java.util.Scanner;
public class PracticeLoop {
    public static void main(String[] args) {


        System.out.println("Enter your sentence");
        String str = new Scanner(System.in).nextLine();
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    result = ""+str.charAt(i);
                    count++;
                }
            }

            if (count==2){
                break;
            }
        }
        System.out.println("First duplicated is: "+result);
    }
}

/*
1. Write a program that can return the first duplicated character from a string

 */