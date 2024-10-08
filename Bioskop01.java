import java.util.Scanner;

public class Bioskop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket;
        String namaPelanggan;
        int hargaTiketPerUnit = 50000;  
        int totalHarga;

        while (true) {
            System.out.print("Masukkan nama pelanggan (atau ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah tiket: ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah yang valid.");
                sc.nextLine(); 
                continue;
            }

            totalHarga = tiket * hargaTiketPerUnit;
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            sc.nextLine();
        }

        System.out.println("Semua transaksi selesai.");
        
    }
}