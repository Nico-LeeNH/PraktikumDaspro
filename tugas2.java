import java.util.Scanner;
public class tugas2 {

    static String[] matkul = {
        "Algoritma dan Struktur Data",
        "Basis Data",
        "Statistik"
    };

    public static void inputnilai(String[] nama, int[][] nilai){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nama.length; i++){
            System.out.println("\nMasukkan nama mahasiswa ke- " + (i + 1) + ": ");
            nama[i] = sc.nextLine();

            for(int j = 0; j < matkul.length; j++){
                System.out.print("Masukkan nilai mata kuliah " + matkul[j] + ": ");
                nilai[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }

    public static double Rata2nilai(int[] nilaiMhs){
        int total = 0;
        for(int nilai : nilaiMhs){
            total += nilai;
        }
        return total/3.0;
    }

    public static String statuslulus(double rata2){
        if (rata2 >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    public static void tampilhasil(String[] nama, int[][] nilai){
        System.out.println("\nHasil Kelulusan Mahasiswa");

        for(int i = 0; i < nama.length; i++){
            double rata2 = Rata2nilai(nilai[i]);
            String status = statuslulus(rata2);

            System.out.println("\nnama: " + nama[i]);
            System.out.println("Rata-rata nilai: " + rata2);
            System.out.println("Status: " + status);
        }
    }
    public static void main(String[] args) {
        
        String[] nama = new String[5];
        int[][] nilai = new int[5][3];

        inputnilai(nama, nilai);
        tampilhasil(nama, nilai);
        
    }
}
