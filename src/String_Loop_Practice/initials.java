package String_Loop_Practice;
import java.util.Scanner;
public class initials {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scan.next();

        System.out.println("Enter last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);


        String initial = f + "." + l;

        System.out.println("initial = " + initial);

     scan.close();
    }
}
/*
2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output

 */