package ReturnMethodTasks;

public class FrequencyIntegerInArrayReturn {
    public static void main(String[] args) {
      int[]numbers ={1,1,1,1,1,2,2};
      int frequency = frequencyNum(numbers,4);
        System.out.println(frequency);
    }

    public static int frequencyNum(int[]numbers, int num){
        int count = 0;
        for (int each : numbers) {
            if(each==num){
                count++;

        }

        }
        return count;
    }
}
/*
 5.Create method that accepts one integer array and
  one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */