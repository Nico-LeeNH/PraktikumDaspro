package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double rata2;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahmahasiswa = sc.nextInt();

        double totallulus = 0, totaltidaklulus = 0;
        int jumlahlulus = 0, jumlahtidaklulus = 0;
        int[] nilaiMhs = new int[jumlahmahasiswa];

        for (int i = 0; i < jumlahmahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totallulus += nilaiMhs[i];
                jumlahlulus++;
            } else {
                totaltidaklulus += nilaiMhs[i];
                jumlahtidaklulus++;
            }
        }

        double ratalulus = (jumlahlulus > 0) ? totallulus / jumlahlulus : 0;
        double ratatidaklulus = (jumlahtidaklulus > 0) ? totaltidaklulus / jumlahtidaklulus : 0;

        System.out.println("Rata - rata nilai lulus = " + ratalulus);
        System.out.println("Rata - rata nilai tidak lulus = " + ratatidaklulus);
        System.out.println("Jumlah mahasiswa yang lulus : " + jumlahlulus);
    }
}
