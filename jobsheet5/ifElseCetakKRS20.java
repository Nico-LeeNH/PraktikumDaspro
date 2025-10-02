package jobsheet5;
import java.util.Scanner;
public class ifElseCetakKRS20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.print("KRS Semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.print("KRS Semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.print("KRS Semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.print("KRS Semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.print("KRS Semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.print("KRS Semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.print("KRS Semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.print("KRS Semester 8 ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }
    }