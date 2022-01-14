package day21_ForEachLoop;

public class Palindrome {
    public static void main(String[] args) {

        String [] words = {"anna", "level", "java"};


        int count =0;


        for (String each : words){
            String str = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                str += each.charAt(i);

                if(str.equals(each)){
                    count++;
                }

                }

            }
             System.out.println(count);

        }





    }

/*
 4.Write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */