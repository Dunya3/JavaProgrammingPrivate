package ReturnMethodTasks;

public class Palindrome {
    public static void main(String[] args) {
        String word = "level";
        System.out.println(isPolindrom(word));
    }
    public static boolean isPolindrom(String word){
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverse +=word.charAt(i);

        }
        boolean isPalindrom=word.equalsIgnoreCase(reverse);
        return isPalindrom;
    }
}
/*
4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter,
 the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

 */