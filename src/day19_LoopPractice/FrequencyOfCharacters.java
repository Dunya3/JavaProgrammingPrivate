package day19_LoopPractice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String results = ""; //a2b1c3d1

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(0); // koliko puta ima a u stringu treba da uporedimo
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //nested loop // frequancy od svakog karektera posebno

                char each = str.charAt(i); // pokazuje svaki karakter od stringa(str) posebno
                if (ch == each) {
                    count++; //ovde povecavamo frequency
                }

            }
            if (results.contains("" + ch)) {
                continue;
            }

            results += ch;
            results += count;
        }
        System.out.println(results);

    }}
/*
        1. Write a program that can find the frequency of the characters from a string
        Ex:
        str = "aabcccd";
        output:
        a2b1c3d1
        */