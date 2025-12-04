package Rekursif;

import java.util.Scanner;

public class Tugas {
    public static int Rekursif(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + Rekursif(arr, index + 1);
    }

    public static int Iteratif(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int angka[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        int totalrekursif = Rekursif(angka, 0);
        int totaliteratif = Iteratif(angka);

        System.out.println("(Rekursif)Total dari " + n + " angka yang dimasukkan adalah: " + totalrekursif);
        System.out.println("(Iteratif)Total dari " + n + " angka yang dimasukkan adalah: " + totaliteratif);
    }
}
