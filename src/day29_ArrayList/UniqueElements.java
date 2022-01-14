package day29_ArrayList;

import java.util.ArrayList;
 import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int frequency = Collections.frequency(list, each); // finds the frequancy of esch element
            if (frequency == 1) { // ako je == 1 onda je unique
                unique.add(each);
            }
        }
        System.out.println(unique);

        System.out.println("------------------------------");

      //samo drugi nacin da nadjemo unique elements
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));


        ArrayList<Integer> unique2 = new ArrayList<>(list2); //add all the elements of list2

        unique2.removeIf( p ->  Collections.frequency(list2, p) > 1 );// - ovo je ako nije unique onda ce nam dati metoda da remove nonunique

        System.out.println("unique2 = " + unique2);



    }

}
