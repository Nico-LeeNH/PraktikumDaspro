package jobsheet8;
import java.util.Scanner;

public class Tugas320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang kafe: ");
        int jumlahcabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        int totalpelanggansemua = 0;
        int totalitemsemua = 0;

        for (int i = 1; i <= jumlahcabang; i++) {
            System.out.println("\n--- Cabang " + i + " --- ");
            System.out.print("Jumlah pelanggan: ");
            int jumlahpelanggan = sc.nextInt();

            int totalitem = 0;

            for (int j = 1; j <= jumlahpelanggan; j++) {
                System.out.print("- Pelanggan " + jumlahpelanggan + " memesan berapa item? ");
                int item = sc.nextInt();
                totalitem += item;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahpelanggan);
            System.out.println("- Item terjual: " + totalitem);

            totalpelanggansemua += jumlahpelanggan;
            totalitemsemua += totalitem;
        }

        System.out.println("\nTotal seluruh cabang: ");
        System.out.println("- Pelanggan: " + totalpelanggansemua + " orang");
        System.out.println("- Item terjual: " + totalitemsemua + " item");

    }

}
