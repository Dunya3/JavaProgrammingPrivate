package PracticeAyarrysList;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max = list.get(0);
        for (int each: list) {
            if(each > max){
                max = each;

        }
        }
        System.out.println(max);
    }
}
/*
Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */