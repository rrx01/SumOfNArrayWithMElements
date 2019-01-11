package first.java;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number of arrays:");
        int n = scanner.nextInt();
        int[] arrsum = new int[n];
        int i = 0;
        while (i < n) {
            System.out.println("Insert number of elements for array " + (i + 1));
            int m = scanner.nextInt();
            int[] arr = new int[m];
            System.out.println("Insert elements of the array");
            for (int j = 0; j < m; j++) {
                arr[j] = scanner.nextInt();
            }
            int sum = calcSumArr(arr);
            arrsum[i] = sum;
            i++;
        }
        for (int a : arrsum) {
            System.out.println("The sum of elements within the array is " + a);
        }

    }

    public static int calcSumArr(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
}