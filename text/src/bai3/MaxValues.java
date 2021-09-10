package bai2;

import java.util.Scanner;

public class MaxValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row of array: ");
        int row = scanner.nextInt();
        System.out.print("Enter column of array: ");
        int column = scanner.nextInt();
        int[][] MaxValue = new int[row][column];
        for (int i = 0; i < MaxValue.length; i++) {
            for (int j = 0; j < MaxValue[i].length; j++) {
                System.out.print("Enter arr[" + i + "][" + j + "] : ");
                MaxValue[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array after setting matrix is: ");
        display(MaxValue, row, column);
        FindMaxValue(MaxValue, row, column);
    }
    public static void FindMaxValue(int[][] arr, int row, int column) {

        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }

        }System.out.println("Max value in array is: "+ max);
    }
    public static void display(int[][] arr, int row, int column) {
        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
    }


}