package Jobsheet9;

import java.util.Scanner;

public class Kafe120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };

        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("\nMasukkan nama makanan/minuman yang dicari: ");
        String cari = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                System.out.println("Menu " + menu[i] + " tersedia pada daftar menu posisi ke : " + (i + 1));
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Menu " + cari + " tidak ada di daftar menu");
        }
    }
}
