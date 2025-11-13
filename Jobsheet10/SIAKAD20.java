package Jobsheet10;

import java.util.Scanner;

public class SIAKAD20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        System.out.println("Masukkan jumlah mata kuliah: ");
        int matkul = sc.nextInt();
        sc.nextLine();

        String[] namaMatkul = new String[matkul];
        System.out.println("\nMasukkan nama-nama mata kuliah: ");
        for (int j = 0; j < matkul; j++) {
            System.out.println("Mata kuliah " + (j + 1) + ": ");
            namaMatkul[j] = sc.nextLine();
        }

        int[][] nilai = new int[jumlahMhs][matkul];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1) + ": ");
            double totalPerSiswa = 0;

            for (int j = 0; j < matkul; j++) {
                System.out.println("Nilai " + namaMatkul[j] + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            double rata2Mhs = totalPerSiswa / matkul;
            System.out.println("Rata - rata nilai mahasiswa ke-" + (i + 1) + ": " + rata2Mhs);

        }

        System.out.println("=================================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < matkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahMhs; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + namaMatkul[j] + ": " + totalPerMatkul / jumlahMhs);
        }

    }
}
