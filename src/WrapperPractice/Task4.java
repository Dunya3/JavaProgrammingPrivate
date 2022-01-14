package WrapperPractice;

public class Task4 {
    public static void main(String[] args) {

        String word = "JAVA java";
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < word.length(); i++) {

            if (Character.toUpperCase(i)==word.charAt(i)){
                countUpper++;
            }else if(Character.toLowerCase(i)==word.charAt(i)){
                countLower++;

            }

        }
        boolean equal = countLower == countUpper;
        System.out.println(equal);






}}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */