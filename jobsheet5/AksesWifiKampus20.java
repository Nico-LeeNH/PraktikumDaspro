package jobsheet5;
import java.util.Scanner;
public class AksesWifiKampus20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- Akses Wifi Kampus ---");
    System.out.print("Apakah anda dosen atau mahasiswa?: ");
    String jenispengguna = sc.nextLine().trim();
    
    if (jenispengguna.equalsIgnoreCase("Dosen")) {
        System.out.print("akses WiFi diberikan (dosen)");
    } else if ((jenispengguna.equalsIgnoreCase("Mahasiswa"))) {
        System.out.print("Masukkan jumlah SKS yang diambil: ");
        int sks = sc.nextInt();
        if (sks >= 12) {
            System.out.print("Akses WiFi diberikan (mahasiswa aktif)");
        } else {
            System.out.print("Akses ditolak, SKS kurang dari 12");
        }
    } else {
        System.out.print(" Akses ditolak");
    }

    } 
}

