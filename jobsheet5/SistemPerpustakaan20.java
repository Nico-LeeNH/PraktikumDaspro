package jobsheet5;

import java.util.Scanner;

public class SistemPerpustakaan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean punyaKTM = sc.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();

        if (punyaKTM && registrasiOnline) {
            System.out.println("Silakan masuk ke perpustakaan.");
        } else {
            System.out.println("Izin masuk ditolak!");
        }

    }
    
}
