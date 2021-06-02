package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int j = 0;
        int n = rand.nextInt(10);
        int[] pos = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < pos.length; i++) {
            pos[i] = rand.nextInt(1000);
        }
        for (int i = 0; i < pos.length; i++) {
            if (pos[i] % 2 == 0) {
                res[j] = pos[i];
                j++;
            }
        }
        System.out.println("Исходная последовательность:");
        for (int i = 0; i < pos.length; i++) {
            System.out.printf("[%4d]", pos[i]);
        }
        System.out.println();
        System.out.println("Массив четных чисел:");
        if (res.length > 0) {
            for (int i = 0; i < res.length; i++) {
                if (res[i] !=0) {
                    System.out.printf("[%4d]", res[i]);
                }

            }
        } else System.out.println("Четных чисел нет");
    }
}

