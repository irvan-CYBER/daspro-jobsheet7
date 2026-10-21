import java.util.Scanner;

public class BioskopTugas17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlah, totalTiket = 0;
        double bayar, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket pelanggan (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket yang valid!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            bayar = jumlah * HARGA_TIKET;
            if (jumlah > 10) {
                bayar = bayar * 0.85; // diskon 15%
                System.out.println("Diskon 15%");
            } else if (jumlah > 4) {
                bayar = bayar * 0.90; // diskon 10%
                System.out.println("Diskon 10%");
            }

            System.out.printf("Total bayar pelanggan: Rp %.0f%n", bayar);
            totalTiket += jumlah;
            totalPenjualan += bayar;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.printf("Total penjualan hari ini: Rp %.0f%n", totalPenjualan);
        sc.close();
    }
}
