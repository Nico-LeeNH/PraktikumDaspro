package jobsheet5;

import java.util.Scanner;

public class Tugas220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.print("Genap");
        } else {
            System.out.print("Ganjil");
        }
        }
}
