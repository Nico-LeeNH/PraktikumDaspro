import java.util.Scanner;
public class CaseMethod20 {
    // Method untuk mengkonversi nilai angka ke nilai huruf
    public static String konversiNilaiHuruf(double nilai) {
        if (nilai >= 80 && nilai <= 100) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 50) return "C";
        else if (nilai >= 39) return "D";
        else return "E";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nama mata kuliah 
        String matkul1 = "Algoritma dan Pemrograman";
        String matkul2 = "Struktur Data";

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

        // Input nilai mata kuliah 1
        System.out.println("\n--- Mata Kuliah 1: " + matkul1 + " ---");
        System.out.print("Nilai UTS: ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas1 = sc.nextDouble();
        double nilaiAkhir1 = (0.30 * uts1) + (0.40 * uas1) + (0.30 * tugas1);

        // Input nilai mata kuliah 2 
        System.out.println("\n--- Mata Kuliah 2: " + matkul2 + " ---");
        System.out.print("Nilai UTS: ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas2 = sc.nextDouble();
        double nilaiAkhir2 = (0.30 * uts2) + (0.40 * uas2) + (0.30 * tugas2);

        // Konversi ke nilai huruf untuk tiap mata kuliah
        String huruf1 = konversiNilaiHuruf(nilaiAkhir1);
        String huruf2 = konversiNilaiHuruf(nilaiAkhir2);

        // Status lulus tiap mata kuliah berdasarkan nilai akhir
        String status1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String status2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        // Menghitung Rata-rata dua nilai akhir mata kuliah
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;

        // Status semester berdasarkan rata-rata
        String statusSemester;
        if (status1.equals("LULUS") && status2.equals("LULUS") && rataRata >= 70) {
            statusSemester = "LULUS";
        } else {
            statusSemester = "TIDAK LULUS (Rata-rata < 70)";
        }

        // Menampilkan hasil penilaian akademik
        System.out.println("\n===== HASIL PENILAIAN AKADEMIK =====");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("");
        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\t\tTugas\tNilai Akhir\tNilai Huruf\t\tStatus");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println(matkul1 + "\t" + uts1 + "\t" + uas1 + "\t\t" + tugas1 + "\t" + String.format("%.2f", nilaiAkhir1) + "\t\t" + huruf1 + "\t\t\t" + status1);
        System.out.println(matkul2 + "\t\t\t" + uts2 + "\t" + uas2 + "\t\t" + tugas2 + "\t" + String.format("%.2f", nilaiAkhir2) + "\t\t" + huruf2 + "\t\t\t" + status2);
        System.out.println("");
        System.out.println("Rata-rata Nilai Akhir: " + String.format("%.2f", rataRata));
        System.out.println("Status Semester: " + statusSemester);
        sc.close();
    }
    
    
}
