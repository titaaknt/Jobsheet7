import java.util.Scanner;

public class Parkir01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan; 
        int durasi;
        double totalPembayaran = 0; 

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk selesai): ");
            jenisKendaraan = sc.nextInt();
            if (jenisKendaraan == 0) {
                break;
            }
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();
            if (durasi <= 0) {
                System.out.println("Durasi parkir tidak valid. Silakan masukkan durasi yang benar.");
                continue; 
            }
            double pembayaran;
            if (durasi > 5) {
                pembayaran = 12500; 
            } else {
                if (jenisKendaraan == 1) {
                    pembayaran = durasi * 3000;
                } else if (jenisKendaraan == 2) {
                    pembayaran = durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid. Silakan masukkan jenis kendaraan yang benar.");
                    continue; 
                }
            }
            totalPembayaran += pembayaran;
            System.out.printf("Total pembayaran untuk kendaraan: Rp %.2f%n", pembayaran);
        }

        System.out.printf("Total pembayaran parkir keseluruhan: Rp %.2f%n", totalPembayaran);
        
    }
}