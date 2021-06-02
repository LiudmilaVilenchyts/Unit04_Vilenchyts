package by.epam.unit04.main;

public class Task10 {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 | j == 0) {
                   arr[i][j] = 1;
                }
                if (i != 0 && j == arr.length - 1) {
                    arr[i][j] = 1;
                }
                if (i == arr.length - 1 && j != 0) {
                    arr[i][j] = 1;
                }

                System.out.printf("[%2d]", arr[i][j]);
            }
            System.out.println();
        }
    }

}
