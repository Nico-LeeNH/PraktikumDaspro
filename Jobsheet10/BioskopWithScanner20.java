package Jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        int menu = 0;

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama penonton: ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan nomor baris (1-4): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan nomor kolom (1-2): ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1]);
                        System.out.println("Silakan pilih kursi lain!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = sc.nextLine();
                    if (next.equals("n")) {
                        break;
                    }
                }

            } else if (menu == 2) {
                System.out.println("\n=== Daftar Kursi Penonton ===");
                int kosong = 0, terisi = 0;

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                            kosong++;
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                            terisi++;
                        }
                    }
                    System.out.println();
                }

                System.out.println("\nKursi terisi: " + terisi);
                System.out.println("Kursi kosong: " + kosong);

            } else if (menu == 3) {
                System.out.println("Program selesai.");
                break;
            } else {
                System.out.println("Menu tidak tersedia, silahkan pilih menu antara 1–3.");
            }
        }
    }
}
