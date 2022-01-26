package Aysun_01_26_2022_Q_U4ASS;
import java.util.Scanner;
public class Q17 {
    public static int action() {
        return 0;
    }

    public static int action(int i) {
        return i*2; // 12
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        total += action(input.nextBoolean()); // total =
        total += action(input.nextInt()); // total =
        total += action(); // total =
        total += action(input.next()); // total =
        total += action(input.next()); // total =

        System.out.println(total); //total =

    }

    public static int action(String s) { //
        return s.length(); //
    }

    public static int action(boolean b) {
        if(!b){ // ! --> opposite
            return 5;
        }else{
            return 10;
        }
    }
}
