package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe20 {
    public int[][] data;
    public String[] menu = {};

    public RekapPenjualanCafe20(int jumlahMenu, int jumlahHari) {
        data = new int[jumlahMenu][jumlahHari];
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.println("\nPenjualan Menu " + menu[i]);
            for (int j = 0; j < data[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void tampilData() {
        System.out.println("\n===== TABEL PENJUALAN =====");
        System.out.print("Menu\t");
        for (int h = 1; h <= data[0].length; h++) {
            System.out.print("Hari ke " + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print(menu[i] + "\t");

            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public void menuTertinggi() {
        int maxTotal = 0;
        int indexMenu = 0;

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[0].length; j++) {
                total += data[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println(menu[indexMenu] + " (Total: " + maxTotal + ")");
    }

    public void rataRataMenu() {
        System.out.println("\n===== RATA-RATA PENJUALAN SETIAP MENU =====");

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[0].length; j++) {
                total += data[i][j];
            }
            double rata = (double) total / data[0].length;

            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine();

        String[] menuBaru = new String[jmlMenu];
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menuBaru[i] = sc.nextLine();
        }

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHari = sc.nextInt();

        RekapPenjualanCafe20 cafe = new RekapPenjualanCafe20(jmlMenu, jmlHari);

        cafe.menu = menuBaru;

        cafe.inputData();
        cafe.tampilData();
        cafe.menuTertinggi();
        cafe.rataRataMenu();
    }
}
