package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //5
        numbers.add(60); //6


        numbers.add(2, 25);//2
        numbers.add(5, 45);//5

        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;

        System.out.println("-------------------------------------");

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("----------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("---------------------------------------------");

        ArrayList<String> emoployees = new ArrayList<>();

        emoployees.add("Sandra");
        emoployees.add("Mixa");
        emoployees.add("Anel");
        emoployees.add("Yulia");
        emoployees.add("Teleuta");
        emoployees.add("Fady");
        emoployees.add("Yevgen");

        System.out.println(emoployees);

        emoployees.remove( 0);

        System.out.println(emoployees);

        emoployees.remove(0);

        System.out.println(emoployees);

        emoployees.remove(0);

        System.out.println(emoployees);

        emoployees.remove(1);

        System.out.println(emoployees);

        emoployees.remove(emoployees.size()-1);

        System.out.println(emoployees);

        boolean r1 = emoployees.remove("Yulia");

        System.out.println(emoployees);

        boolean r2 = emoployees.remove("Fady");

        System.out.println(emoployees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}