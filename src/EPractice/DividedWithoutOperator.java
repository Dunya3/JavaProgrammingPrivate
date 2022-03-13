package EPractice;

public class DividedWithoutOperator {
    public static void main(String[] args) {

       dividedNum(10,2);

    }

    public static void dividedNum(int num, int num2) {

        int division = 0;
        while (num >= num2){
            num = num - num2;
        division += 1;
    }
        System.out.println("Division is = " + division);

}





}
/*
2.Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator.

 */