package by.epam.unit04.main;

import java.util.Random;

//реализовать сортировки выбором или пузырьком по убыванию
public class Task04 {
    public static void main (String[] args){
        Random rand = new Random();
        int n = rand.nextInt(10);
        int[] arr = new int[n];
        boolean sorted = false;
        System.out.println("Исходный массив: ");
        for (int i=0;i<arr.length; i++){
            arr[i] = rand.nextInt(1000);
            System.out.printf("[%4d]", arr[i]);
        }
        System.out.println();
        while (!sorted){
            sorted=true;
           for (int i=0;i<arr.length-1; i++){
               if (arr[i]<arr[i+1]){
                  int temp = arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=temp;
                  sorted=false;
               }
           }
        }
        System.out.println("Отсортированный массив: ");
        for (int i=0;i<arr.length;i++){
            System.out.printf("[%4d]", arr[i]);
        }
    }
}
