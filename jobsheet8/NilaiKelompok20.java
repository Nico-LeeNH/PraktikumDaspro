package jobsheet8;
import java.util.Scanner;

public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float nilaiMhs, totalNilai, rataNilai;
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
            i++;

        }
    }
}
