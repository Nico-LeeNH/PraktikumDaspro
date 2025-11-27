package Pertemuan14;

import java.util.Scanner;

public class Kafe20 {
    public static void menu(String namaPelanggan, boolean isMember, String Promo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member , dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (Promo.equals("DISKON50")) {
            System.out.println("Kode promo valid: Diskon 50%");
        } else if (Promo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Diskon 30%");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String Promo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;

        if (Promo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid: Diskon 50%");
            totalHarga *= 0.5;
        } else if (Promo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid: Diskon 30%");
            totalHarga *= 0.7;
        } else {
            System.out.println("invalid");
        }

        return totalHarga;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalsemua = 0;
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("\nMasukkan nomor menu(1-6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo: ");
            String Promo = sc.next();

            int total = hitungTotalHarga(pilihanMenu, banyakItem, Promo);
            totalsemua += total;
            System.out.println("Subtotal: Rp " + total);

            System.out.print("\nPesan menu lain? (y/n): ");
            String jawab = sc.next();

            if (jawab.equalsIgnoreCase("n")) {
                lanjut = false;
            }

        }

        System.out.println("Total harga pembelian: " + totalsemua);
    }

}
