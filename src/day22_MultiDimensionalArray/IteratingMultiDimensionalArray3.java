package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray3 {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };

        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int j = 0; j < arr2D.length; j++) {
                System.out.print(arr2D[i][j]+  " ");
            }
            System.out.println();
        }





    }
}
/*
13 12 11 10 9
8 7 6 5 4
3 2 1
 */