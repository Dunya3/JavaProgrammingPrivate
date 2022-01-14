package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodsPractice4;

public class Test {
    public static void main(String[] args) {

        String str = "aaaaaaaaaaaabbbbbbbbbbbbbbbbbbb";

        str = ReturnMethodsPractice4.removeDuplicated(str);

        System.out.println(str);

        String name = "Java programing";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);
        

    }

}
