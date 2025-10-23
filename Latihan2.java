import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gaji = 0;
        System.out.println("=== Program Menentukan Bonus Pegawai ==="); 

        while (true) {
            System.out.println("Masukkan jumlah jam kerja: ");
            int jamkerja = sc.nextInt();

            if (jamkerja < 0) {
                System.out.println("Input jam kerja negatif");
                break;
                
            } 

            System.out.println("Masukkan gaji harian: ");
            double gajiharian = sc.nextDouble();
            double bonus = 0;

            if (jamkerja > 8) {
                bonus = 0.20 * gajiharian;
                System.out.println("Bonus yang didapat: " + bonus);
            } else {
                System.out.println("Pegawai bekerja <= 8 jam, tidak dapat bonus");
            }
            double totalgaji = gajiharian + bonus;
            System.out.println("Total gaji yang didapat: " + totalgaji);
        }


        sc.close();
        
    }
}
