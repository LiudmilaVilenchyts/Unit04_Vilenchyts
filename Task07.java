package by.epam.unit04.main;

import java.util.Random;

//дава квадратная матрица. Вывести на экран элементы, стоящие по диагонали
public class Task07 {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        Random rand = new Random();
        int[][] arr = new int[n][n];
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(99);
                System.out.printf("[%2d]", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Элементы, стоящие по диагонали:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.printf("[%2d]", arr[i][j]);
                }
            }
        }
    }
}