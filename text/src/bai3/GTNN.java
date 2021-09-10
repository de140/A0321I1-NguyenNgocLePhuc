package bai2;

import java.util.Scanner;

public class GTNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.print("Nhap vao so phan tu cua mang:  ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("So phan tu cua mang khong vuot qua 20");
            }
        } while (size > 20);
        array = new int[size];

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang gom co cac gia tri nhu sau: ");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        System.out.println("Gia tri nho nhat la: " + minValue(array));
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}