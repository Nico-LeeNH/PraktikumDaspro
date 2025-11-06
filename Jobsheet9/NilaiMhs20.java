package Jobsheet9;

import java.util.Scanner;

public class NilaiMhs20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.print("\nMasukkan jumlah nilai mahasiswa: ");
        int jumlahnilai = sc.nextInt();

        int[] nilai = new int[jumlahnilai];

        for (int i = 0; i < jumlahnilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];

        }

        double rata2 = total / jumlahnilai;
        int nilaitinggi = nilai[0];
        int nilairendah = nilai[0];
        for (int i = 1; i < jumlahnilai; i++) {
            if (nilai[i] > nilaitinggi) {
                nilaitinggi = nilai[i];
            }
            if (nilai[i] < nilairendah) {
                nilairendah = nilai[i];
            }

        }

        System.out.println("\n===== Daftar Nilai Mahasiswa =====");
        for (int i = 0; i < jumlahnilai; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }
        System.out.println("\nRata-rata Nilai Mahasiswa: " + String.format("%.2f", rata2));
        System.out.println("Nilai tertinggi: " + nilaitinggi);
        System.out.println("Nilai terendah: " + nilairendah);

    }
}
