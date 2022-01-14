package day24_CustomMethods_Return;

public class ReturnMethodsPractice4 {
    public static void main(String[] args) {
       String str = "cccccccdddaaaaaaabbbbbbbbb";
       str = removeDuplicated(str);

        System.out.println(str);
    }

//1.Create a method that can remove duplicated characters from a string and returns the new value
public static String removeDuplicated(String str){ //"aaabbcc" ==> "abc"

    String results="";
    for (int i = 0; i < str.length(); i++) {
        char each = str.charAt(i);

        if (!results.contains(""+each))  //dose not contain a character
            results += each;
    }
        return results;
}

}


/* domaci
 2. create a method that can return the maximum number from an array of integers

    3. create a method that can return the minimum number from an array of integers

    4. create a method that return the reversed array

    5. create a method that can merge two arrays and return
 the new array
 */