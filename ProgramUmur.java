import java.util.Scanner;
import java.util.Calendar;

public class ProgramUmur {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan tahun lahir
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur menggunakan tahun sekarang
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        int umur = tahunSekarang - tahunLahir;

        // Menampilkan umur
        System.out.println("Umur Anda adalah: " + umur + " tahun");

        // Menutup scanner
        scanner.close();
    }
}