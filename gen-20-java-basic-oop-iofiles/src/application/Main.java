package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "jadwal-penerbangan.txt"; //set file sebagai penampung isi file

        PenerbanganData jadwalPenerbangan = new PenerbanganData(fileName); // object baru

        int pilih = 0;

        while (pilih != 5){
            System.out.println("\nDaftar Jadwal Penerbangan");
            System.out.println("1.\t Tambah jadwal penerbangan");
            System.out.println("2.\t Perbarui jadwal penerbangan");
            System.out.println("3.\t Hapus jadwal penerbangan");
            System.out.println("4.\t Daftar seluruh jadwal penerbangan");
            System.out.println("5.\t Keluar");

            System.out.print("Masukan pilihan : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih ){
                case 1 : //proses create
                    System.out.println("\nTambah jadwal penerbangan");
                    System.out.println("Masukan jadwal penerbangan (format : kode penerbangan, nama pesawat, jumlah penumpang) : ");
                    String inputDataPenerbangan = sc.nextLine();
                    jadwalPenerbangan.create(inputDataPenerbangan);

                    break;

                case 2 : //proses update
                    System.out.println("\nPerbarui jadwal penerbangan");
                    System.out.print("Masukkan baris yang akan diperbarui : ");
                    int lineNumberUpdate = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Masukan jadwal penerbangan (format : kode penerbangan, nama pesawat, jumlah penumpang) : ");
                    String updateDataPenerbangan = sc.nextLine();

                    jadwalPenerbangan.update(lineNumberUpdate, updateDataPenerbangan);

                    break;

                case 3 : //proses delete
                    System.out.println("\nHapus jadwal penerbangan");
                    System.out.print("Masukkan baris yang akan dihapus : ");
                    int lineNumberDelete = sc.nextInt();
                    sc.nextLine();

                    jadwalPenerbangan.delete(lineNumberDelete);

                    break;
                case 4 : //proses read
                    System.out.println("Jadwal Penerbangan");
                    jadwalPenerbangan.read();
                    break;

                case 5 : //proses exit program
                    System.out.println("\nTerima Kasih!!!");
                    return;
                default:
                    System.out.println("\nInputan salah \nHarap masukan pilihan (1 - 5)\n");

            }

        }
        sc.close();
    }
}
