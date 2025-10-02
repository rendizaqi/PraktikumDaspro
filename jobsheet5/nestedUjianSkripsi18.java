package jobsheet5;

import java.util.Scanner;
public class nestedUjianSkripsi18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkkan jumlah log bimbingan Pembibing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkkan jumlah log bimbingan Pembibing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan ="Semua syarat terpenuhi, mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan ="Gagal! log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan ="Gagal! log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan ="Gagal! log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan ="Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        
    }
} 
    
