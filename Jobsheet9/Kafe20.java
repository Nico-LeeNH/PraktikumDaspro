package Jobsheet9;

import java.util.Scanner;

public class Kafe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.println("Masukkan jumlah pesanan: ");
        int jumlahpesan = sc.nextInt();
        sc.nextLine();

        String[] namapesan = new String[jumlahpesan];
        double[] hargapesan = new double[jumlahpesan];

        for (int i = 0; i < jumlahpesan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namapesan[i] = sc.nextLine();

            System.out.print("Masukkan harga: ");
            hargapesan[i] = sc.nextDouble();
            sc.nextLine();

        }

        for (int i = 0; i < jumlahpesan; i++) {
            total += hargapesan[i];
        }

        System.out.println("\n====== Daftar Pesanan ======");
        for (int i = 0; i < jumlahpesan; i++) {
            System.out.printf("%d. %s - Rp%.2f\n", (i + 1), namapesan[i], hargapesan[i]);
        }

        System.out.printf("Total biaya pesanan: Rp%.2f\n", total);

    }
}
