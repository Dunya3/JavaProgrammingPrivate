package Adampractice_12_08_2021;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        //veoma vazno na intervjuju
        //ako je palnidrome onda cekiramo rec da li moze da se cita sa obe strane isto
       // ne uzimaj reverse method za resavanje ovog zadatka
        //dobar primer sa sccanerom u day21 ima primer bez scannera sa each loop
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        String result = "";

        for (int i = word.length()-1; i >=0; i--) {
            result += word.charAt(i); // ovde stavljamo charAt da bi cekirali svaki karakter da se vidi da je palnidrome

        }
        boolean isPlaindrome=word.equalsIgnoreCase(result); //zato sto broj od pocetka moze da pocne sa velikim slovom zato ovaj Stirng
        System.out.println(isPlaindrome);
    }
}

/*
                       Write a program that can check if the given String is palindrome

                                  Ex:
                                      input:
                                          Level

                                      output:
                                          true


                                      input:
                                          Anna

                                      output:
                                          true

                       */
