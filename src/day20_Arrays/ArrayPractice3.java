package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt(); //5 da pitamo user to print 10 puta in loop treba nam for posle if i int

        if (length <= 0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
                                          //array needs to have enough capacity to contain all the elements user going to enter
        int[] numbers = new int[length]; //[10, 20, 0, 0, 50]

        for (int i = 0; i < length; i++) { // i: 0, 1  zadnji index je uvek <
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt(); //10, 20,...50 each input user provided during each execution of the loop,
                                                      // will be assigned to the indexes of the array
        }
        //pre nego printamo moramo pretvoriti array u string
        System.out.println(Arrays.toString(numbers) );

        scan.close();





    }
}
