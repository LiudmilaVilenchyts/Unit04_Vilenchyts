package by.epam.unit04.main;


public class Task09 {
    public static void main (String[] args){
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i=0 ; i <arr.length; i++){
            for (int j= arr[i].length-1; j>-1 ; j--){
                arr[i][i]=i+1;
                System.out.printf("[%2d]", arr[i][j]);
            }
            System.out.println();
        }
    }
}
