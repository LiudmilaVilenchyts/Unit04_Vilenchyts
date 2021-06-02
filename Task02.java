package by.epam.unit04.main;

import java.util.Random;

//дана последовательность чисел а1-аН. Указать наименьшую длину числовой оси, содержащую все эти числа
public class Task02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(20);
        int[] arr = new int[n];
        int min = arr[0];
        int max = arr[0];
        for (int i=0;i< arr.length;i++){
            arr[i]= rand.nextInt(1000);
            if(rand.nextInt(1000)%3==0){
                arr[i]=-arr[i];
            }
        }
        System.out.println("Исходный массив:");
        for (int i= 0; i< arr.length;i++){
            System.out.printf("[%4d]", arr[i]);
        }
        System.out.println();
        for (int i=0; i< arr.length;i++){
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальная длина числовой оси: "+ (max-min));
    }
}
