package by.epam.unit04.main;

import java.util.Random;

//дан двухмерный массив н*м элементов. Определить, сколько раз встречается число 7 среди элементов массива
public class Task06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 5;
        int m = 7;
        int count = 0;
        int[][] arr = new int[n][m];
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10);
                System.out.printf("[%1d]", arr[i][j]);
                if (arr[i][j] == 7) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("число 7 встречается " + count + " раз");
    }
}
