package day25_CustomMethodsOverloding;

import utilities.StringUtility;

public class TestStrings {
    public static void main(String[] args) {

        String str = "Java Programing Language";

        StringUtility.printEachChar(str);

        System.out.println("=============================");

        String s1 = "Wooden Spoon";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);
        
        String word = "Civic";
        
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("==================================");

        String s2 = "aaaaaaaabbbbbbbcccccccdddddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);
    }
}

