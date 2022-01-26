package Aysun_01_26_2022_Q_U4ASS;
import java.util.ArrayList;
import java.util.Arrays;
public class Q25 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList
                ("during", "storm", "rain", "fell", "season", "cloudy", "safe"));
        ArrayList<Integer> lengths = new ArrayList<>();

        for (String word : words) {
            //lengths.add(word.length); compile error sa zagradama bi radilo (word.length()) zato sto je string

            System.out.println(lengths);

        }
    }}
