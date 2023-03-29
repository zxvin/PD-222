import java.util.Scanner;

public class Nominal {



        public static void main(String[] args) {
            int jumlahUang;

            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan jumlah uang: ");
            jumlahUang = input.nextInt();

            int nDuaPuluh = jumlahUang / 20000;
            int sisa = jumlahUang - (nDuaPuluh * 20000);
            int nSepuluh = sisa / 10000;
            sisa = sisa - (nSepuluh * 10000);
            int nSeribu = sisa / 1000;
            sisa = sisa - (nSeribu * 1000);
            int nLimaRatus = sisa / 500;
            sisa = sisa - (nLimaRatus * 500);
            int nDuaRatus = sisa / 200;
            sisa = sisa - (nDuaRatus * 200);
            int nSeratus = sisa / 100;

            System.out.println("Pecahan uang:");
            System.out.println("Dua puluh ribuan: " + nDuaPuluh);
            System.out.println("Sepuluh ribuan: " + nSepuluh);
            System.out.println("Seribu: " + nSeribu);
            System.out.println("Lima ratusan: " + nLimaRatus);
            System.out.println("Dua ratusan: " + nDuaRatus);
            System.out.println("Seratusan: " + nSeratus);
        }
    }


