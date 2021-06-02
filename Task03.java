package by.epam.unit04.main;

import java.util.Random;

//дан массив действительных чисел. подсчитать, сколько в нем отрицательных, положительных и нулевых элементов
public class Task03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int n = rand.nextInt(35);
        int[] arr = new int[n];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
            if (arr[i] % 3 == 0) {
                arr[i] = -arr[i];
            }
            if (arr[i] % 7 == 0) {
                arr[i] = 0;
            }

            System.out.printf("[%4d]", arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            }
            if (arr[i] < 0) {
                neg++;
            }
            if (arr[i] > 0) {
                pos++;
            }
        }

        System.out.println("Отрицательных чисел - " + neg);
        System.out.println("Положительных чисел - " + pos);
        System.out.println("Нулей - " + zero);
    }
}

