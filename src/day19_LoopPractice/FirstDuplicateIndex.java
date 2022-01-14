package day19_LoopPractice;

public class FirstDuplicateIndex {
    public static void main(String[] args) {

        System.out.println("Enter a first duplicate");

        String s = "ajfrghyy";
        String newWord2 = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    newWord2 = s.charAt(i) + "";

                }
            }
            if (count == 2) {
                break;
            }
        }

        System.out.println("first duplicate is: " +newWord2);
        System.out.println("index of first duplicate character: "+s.indexOf(newWord2));
    }


    }


/*
2. Write a program that cna return the index number of the first duplicated character from a string
 */