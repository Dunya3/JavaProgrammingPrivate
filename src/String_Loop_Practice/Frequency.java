package String_Loop_Practice;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

          String sentence = "Java java ";

          int results = 0;
        for (int i = 0; i <= sentence.length()-4; i++) {
            String word = sentence.substring(i, i + 4);
            if(word.equals("Java"));
            results = results + 1;

        }
        System.out.println(results);
          }

    }

     /* 4.Write a program that can return the frequency of
      the word Java from the sentence.

        Ex:
        sentence = "Java Java";

        output:
        2

        Hint: you need to create
        */