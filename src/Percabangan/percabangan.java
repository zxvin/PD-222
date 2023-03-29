package Percabangan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //if - else
        //cek syarat pembuatan KTP
        int usia;
        System.out.print("Masukkan Usia Anda : ");
        usia = Integer.parseInt(br.readLine());
        if (usia >= 17) {
            System.out.println("Sudah Memenuhi Syarat");
        } else {
            System.out.println("Belum Memenuhi Syarat");
        }

        //if - else - if
        //cet status kelulusan MK berdasarkan nim dan nilai UTS
        String nim;
        int nilaiUAS;
        System.out.print("Masukkan NIM Anda : ");
        nim = br.readLine();
        System.out.print("Masukkan Nilai UAS Anda : ");
        nilaiUAS = Integer.parseInt(br.readLine());

        //jika nilai 80 70 65 = lulus, dibawah 65 tidak lulus
        if (nim.equalsIgnoreCase("22410100065") && nilaiUAS == 80){
            System.out.println("LULUS");

        } else if (nim.equalsIgnoreCase("22410100065") && nilaiUAS == 70) {
            System.out.println("LULUS");

        } else if (nim.equalsIgnoreCase("22410100065") && nilaiUAS == 65) {
            System.out.println("LULUS");

        } else if (nim.equalsIgnoreCase("22410100065") && nilaiUAS < 65) {
            System.out.println("TIDAK LULUS");

        } else {
            System.out.println("Nilai Tidak Ditemukan");
        }


        //nested if
        //menu yang akan di pilih
        //makanan = snack, nasi bungkus
        //minuman = kopi, teh, air mineral

        String menu, jenis;
        System.out.print("Masukkan Menu (Makanan atau Minuman) : ");
        menu = br.readLine();
        System.out.println("Masukkan Jenis Menu \n Makanan : Snack, Nasi Bungkus \n" + "Minuman : Kopi, Teh, Air Mineral. Pilih : ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("Makanan")) {
            if (jenis.equalsIgnoreCase("Snack")){
                System.out.println("Snack 2000");
            } else {
                System.out.println("Nasi Bungkus 5000");
            }

        } else if (menu.equalsIgnoreCase("Minuman")){
            if (jenis.equalsIgnoreCase("Kopi")) {
                System.out.print("Kopi : 3000");
            } else if (jenis.equalsIgnoreCase("Teh")) {
                System.out.print("Teh : 2000");
            } else if (jenis.equalsIgnoreCase("Air Mineral")) {
                System.out.print("Air Mineral : 2500");
            }
        }

    }
}