// Soal ke-3
// nama: Nico Lee Nathanael Handoko
// nim: 254107060005
// kelas: 1B

package Kuis2;

import java.util.Scanner;

public class Soal320 {
    public static char getGrade(int nilai) {
        if (nilai >= 85)
            return 'A';
        else if (nilai >= 70)
            return 'B';
        else if (nilai >= 55)
            return 'C';
        else if (nilai >= 40)
            return 'D';
        else
            return 'E';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[][] nilai = new int[n][3];
        char[][] grade = new char[n][3];

        String[] matkul = { "Dasar Pemrograman", "Matematika", "CTPS" };

        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + matkul[j] + ": ");
                nilai[i][j] = sc.nextInt();
                grade[i][j] = getGrade(nilai[i][j]);
            }
        }

        double[] rataMhs = new double[n];
        for (int i = 0; i < n; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += nilai[i][j];
            }
            rataMhs[i] = total / 3;
        }

        double[] rataMatkul = new double[3];
        for (int j = 0; j < 3; j++) {
            double total = 0;
            for (int i = 0; i < n; i++) {
                total += nilai[i][j];
            }
            rataMatkul[j] = total / n;
        }

        System.out.println("\n========================================");
        System.out.printf("%-15s %-20s %-20s %-20s\n",
                "Mhs", "Daspro", "Matematika", "CTPS");

        for (int i = 0; i < n; i++) {
            System.out.printf("Mhs-%-11d %-14s(%c) %-14s(%c) %-14s(%c)\n",
                    i + 1,
                    nilai[i][0], grade[i][0],
                    nilai[i][1], grade[i][1],
                    nilai[i][2], grade[i][2]);
        }

        System.out.println("\n=== Rata-rata tiap Mahasiswa ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + rataMhs[i]);
        }

        System.out.println("\n=== Rata-rata tiap Mata Kuliah ===");
        for (int j = 0; j < 3; j++) {
            System.out.println(matkul[j] + ": " + rataMatkul[j]);
        }

        double max = rataMatkul[0];
        int idxMax = 0;

        for (int j = 1; j < 3; j++) {
            if (rataMatkul[j] > max) {
                max = rataMatkul[j];
                idxMax = j;
            }
        }

        System.out.println("\nMata kuliah dengan rata-rata tertinggi: " + matkul[idxMax] + " (" + max + ")");
    }
}
