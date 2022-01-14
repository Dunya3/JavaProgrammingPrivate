package day20_Arrays;

public class MaxNumOfArray {
    public static void main(String[] args) { // skracenice ili shorts cuts za loop sa array
         int[] numbers = {10, 5, 4, 20, 1, 0}; //prvo 10 stoji u i zato sto je i O u loop pa onda loop ide da cekira svaki sledeci broj
         int max = numbers[0]; //10 recimo da je num 10 moramo prvo da ga uporedimo ovo uzimamo za rezultat na kraju

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){ // if there is element in the arry thats greater than the current max number
                max = numbers[i]; // assigning greater number to variable max
            }
        }
            System.out.println(max);
    }
}
