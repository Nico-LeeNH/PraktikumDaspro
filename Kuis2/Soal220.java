// Soal ke-2
// nama: Nico Lee Nathanael Handoko
// nim: 254107060005
// kelas: 1B

package Kuis2;
import java.util.Scanner;
public class Soal220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kota: ");
        int k = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int h = sc.nextInt();

        double suhu[][] = new double[k][h];
        for (int i = 0; i < k; i++){
            System.out.println("Masukkan data suhu untuk kota ke-" + (i + 1) + ": ");
            for (int j=0; j < h; j++){
                System.out.print("Hari ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }
        // menghitung dan menampilkan rata rata, suhu maksimum dan minimum setiap kota
        double rataTertinggi = 0;
        double rataTerendah = 0;
        int kotaTertinggi = 0;
        int kotaTerendah = 0;
        
        for (int i = 0; i < k; i++){
            double total = 0;
            double max = suhu[i][0];
            double min = suhu[i][0];
            for (int j = 0; j < h; j++){
                total += suhu[i][j];
                if (suhu[i][j] > max){
                    max = suhu[i][j];
                }                  
                if (suhu[i][j] < min){
                    min = suhu[i][j];
                }
            }
            double rata2 = total / h;
            System.out.println("\nKota ke-" + (i + 1) + ": ");
            System.out.println("Rata-rata suhu: " + rata2);
            System.out.println("Suhu tertinggi: " + max);
            System.out.println("Suhu terendah: " + min);

            if (i == 0) {
                rataTertinggi = rataTerendah = rata2;
                kotaTertinggi = kotaTerendah = i;
            } else {
                if (rata2 > rataTertinggi) {
                    rataTertinggi = rata2;
                    kotaTertinggi = i;
                }
                if (rata2 < rataTerendah) {
                    rataTerendah = rata2;
                    kotaTerendah = i;
                }
            }
        }
        System.out.println("Kota dengan rata-rata suhu tertinggi: Kota ke-" + (kotaTertinggi + 1) + " dengan rata-rata suhu: " + rataTertinggi);
        System.out.println("Kota dengan rata-rata suhu terendah: Kota ke-" + (kotaTerendah + 1) +  " dengan rata-rata suhu: " + rataTerendah);
        
        
    }
}
