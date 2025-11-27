// Soal ke-1
// nama: Nico Lee Nathanael Handoko
// nim: 254107060005
// kelas: 1B

package Kuis2;

import java.util.Scanner;

public class Soal120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = sc.nextInt();

        int[] n = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        int tertinggi = n[0];
        int terendah = n[0];
        for (int i = 1; i < jumlah; i++) {
            if (n[i] > tertinggi) {
                tertinggi = n[i];
            }
            if (n[i] < terendah) {
                terendah = n[i];
            }
        }
        System.out.println("==================================");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + n[i]);
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
