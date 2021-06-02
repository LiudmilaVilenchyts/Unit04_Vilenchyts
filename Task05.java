package by.epam.unit04.main;

import java.util.Random;

//реализовать алгоритм сортировки вставками
public class Task05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arrLength = rand.nextInt(10);
        int[] arr = new int[arrLength];
        boolean sorted = false;
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = rand.nextInt(1000);
            System.out.printf("[%4d]", arr[i]);
        }
        System.out.println();
        for (int i = 1; i < arrLength; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%4d]", arr[i]);
        }
    }
}
