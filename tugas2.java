
public class tugas2 {
    public static void main(String[] args) {
        char h = 'a'; // huruf awal

        int baris = 5; // jumlah baris segitiga

        for (int i = 1; i <= baris; i++) {
            int jumlahHuruf = 2 * i - 1;

            // cetak spasi di depan agar segitiga rata tengah
            for (int b = baris - i; b > 0; b--) {
                System.out.print(" ");
            }

            // cetak huruf di tiap baris
            for (int j = 1; j <= jumlahHuruf; j++) {
                // if (h > 'z') { // reset kalau lewat z
                //     h = 'a';
                // }
                System.out.print(h);
                h++;
            }

            System.out.println(); // ganti baris
        }
    }
}
