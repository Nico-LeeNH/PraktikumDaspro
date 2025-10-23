package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        
        // ternary operator
        String pesan = uktLunas ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Pembayaran UKT belum lunas\nSilahkan lunasi UKT terlebih dahulu";
        System.out.println(pesan);

        if (uktLunas) {
            System.out.print("Pembayaran UKT terverifikasi");
            System.out.print("Silahkan cetak KRS dan minta tanda tangan DPA");
        } 
        }
    }