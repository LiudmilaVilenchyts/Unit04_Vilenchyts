package by.epam.unit04.main;

import java.util.Random;

//дана матрица. вывести к-строку и р-столбец матрицы
public class Task08 {
    public static void main(String[] args) {
        Random rand = new Random();
        int k = 2;//номер строки
        int p = 3;//номер столбца
        int[][] arr = new int[5][6];
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(99);
                System.out.printf("[%2d]", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("строка № " + k + ":");
        for (int i = 0; i < arr[k].length; i++) {
            System.out.printf("[%2d]", arr[k][i]);
        }
        System.out.println();
        System.out.println("столбец № " + p + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%2d]", arr[i][p]);
        }
    }
}
