package jobsheet5;
import java.util.Scanner;
public class IfCetakKRS18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Cetak KRS Siakad ----");
        System.out.print("Apakah UKT anda sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        System.out.println(uktLunas ? "Pembayaran terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak, Silakan lunasi UKT terlebih dahulu");
        }
    }