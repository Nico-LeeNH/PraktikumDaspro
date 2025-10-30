package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float nilaiMhs, totalNilai, rataNilai;
        float maxRata = 0;
        int kelompokMax = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;

            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": " + "nilai rata-rata " + rataNilai);

            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokMax = i;
            }

            i++;

        }
        System.out.println("\nKelompok dengan rata-rata tertinggi:");
        System.out.println("Kelompok " + kelompokMax + " dengan nilai rata-rata " + maxRata);
    }
}
