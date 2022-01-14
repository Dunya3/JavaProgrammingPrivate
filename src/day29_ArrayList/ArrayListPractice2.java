package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
                                                 //-ova metoda - removing unmatchig elements
        ArrayList<String> employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));
        employees.retainAll( Arrays.asList("Ahmed", "David") );
        System.out.println(employees);

        System.out.println("------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan","Beril"};
                                                                          //prvo moramo da kovrtujemo array to array list
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names) ); //-ove je konvertovano u array list
                                                                        //ovde remove from arraylist
        list.removeIf( p -> p.charAt(0) == 'M');

        names = list.toArray(new String[0]);                           //ovde konvt=rtujemo to String Array

        System.out.println(Arrays.toString(names));


    }
}
