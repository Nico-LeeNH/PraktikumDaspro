import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bilangan = new int[10];

        System.out.println("Masukkan 10 elemen array:");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            bilangan[i] = sc.nextInt();
        }

        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int n = sc.nextInt();

        boolean ditemukan = false;
        
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == n) {
                ditemukan = true;
                System.out.println("Nilai " + n + "Indeks ke-" + i);
                
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + n + " tidak ditemukan dalam array.");
        }
    }
}
