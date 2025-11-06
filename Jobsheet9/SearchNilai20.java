package Jobsheet9;

import java.util.Scanner;

public class SearchNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahnilai = sc.nextInt();
        int ArrNilai[] = new int[jumlahnilai];

        for (int i = 0; i < ArrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            ArrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1;
        boolean ditemukan = false;

        for (int i = 0; i < ArrNilai.length; i++) {
            if (ArrNilai[i] == key) {
                ditemukan = true;
                hasil = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("\nNilai yang dicari tidak ditemukan");
        }

    }
}
