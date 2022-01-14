package day19_LoopPractice;

public class UniqueCharacters1 {

    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = ""; //bdf


        char ch = 'a';
        int count = 0; // represents the frequency of the ch
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); // each character of str
            if(ch == each){
                count++;
                for (int j = 0; j < str.length(); j++) {

                    char ch1 = str.charAt(j); //'A'
                    int count1 = 0; // represents the frequency of the ch

                    for (int k = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                        char each1 = str.charAt(i); // each character of str
                        if(ch == each){
                            count++;
                        }
                    }

 /*
             if(count == 1){ // if the frequency of the character is 1, then the character is unique
                 result += ch;
             }
  */
                    if(count != 1){
                        continue;
                    }

                    result += ch;

                }


                System.out.println(count);
                System.out.println(result);




            }

        }
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
                        output:
                                bdf
 */

    }}
