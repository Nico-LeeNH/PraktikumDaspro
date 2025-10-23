import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalJam = 0;

        System.out.println("=== Program Menghitung Total Jam Belajar Dalam Seminggu ===");
        for (int i = 1; i <= 7; i++) {
            int jamBelajar;
            while (true) {
                System.out.print("Masukkan jam belajar Hari ke-" + i + ": ");
                jamBelajar = sc.nextInt();
                if (jamBelajar > 10) {
                    System.out.println("Input tidak valid, silahkan masukkan ulang.");
                } else {
                    break;
                }
            }
            totalJam += jamBelajar;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Total jam belajar dalam seminggu: " + totalJam + "jam");
        System.out.println("Program selesai.");

        sc.close();
        
    }
}
