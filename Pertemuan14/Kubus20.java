package Pertemuan14;

import java.util.Scanner;

public class Kubus20 {

    static int Luas(int s) {
        int Luas = 6 * s * s;
        return Luas;
    }

    static int Volume(int s) {
        int volume = s * s * s;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, L, vol;

        System.out.print("Masukkan sisi: ");
        s = input.nextInt();

        L = Luas(s);
        System.out.println("Luas permukaan kubus adalah " + L);

        vol = Volume(s);
        System.out.println("Volume kubus adalah " + vol);

        input.close();

    }
}
