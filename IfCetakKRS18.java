import java.util.Scanner;
public class IfCetakKRS18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Cetak KRS Siakad ---");
        System.out.print("Apakah UKT anda sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran terverifikasi");
            System.out.println("Silakan cetal KRS dan minta tanda tangan DPA");
        }
    }
}
