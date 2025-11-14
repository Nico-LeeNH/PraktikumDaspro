package Jobsheet10;

import java.util.Scanner;

public class Survei20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int responden = 10;
        int pertanyaan = 6;
        int[][] survei = new int[responden][pertanyaan];

        System.out.println("=== Input nilai survei (1 - 6) ===");
        for (int i = 0; i < responden; i++) {
            System.out.println("\nResponden ke-" + (i + 1) + ":");
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + " = ");
                survei[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== Rata - rata tiap responden ===");
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survei[i][j];
            }
            double rata = total / pertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata);
        }

        System.out.println("\n=== Rata-rata tiap pertanyaan ===");
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) {
                total += survei[i][j];
            }
            System.out.println("Pertanyaan ke-" + (j + 1) + " = " + total / responden);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        System.out.println("\n=== Rata - rata keseleruhuan ===");
        System.out.println("Nilai rata-rata: " + totalKeseluruhan / (responden * pertanyaan));
    }
}
