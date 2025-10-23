
import java.util.Scanner;

public class Bioskop20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;

        System.out.println("Masukkan jumlah pelanggan hari ini: ");
        int jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++){
            int jumlahTiket;

            while (true) {
                System.out.println("Masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid! Silahkan input ulang.\n");
                } else {
                    break;
                }
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double hargaSetelahDiskon = totalHarga - (totalHarga * diskon);

            System.out.println("Total harga sebelum diskon: Rp" + totalHarga);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total bayar: Rp" + hargaSetelahDiskon);

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaSetelahDiskon;
        }

        System.out.println("\n=== Laporan Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan tiket: Rp" + totalPenjualan);
        sc.close();
    }
}
