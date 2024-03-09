package application;

import data.Pegawai;
import data.PegawaiService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PegawaiService<Integer, Pegawai> pegawai = new PegawaiData();
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String nama = null;
        String alamat = null;

        int pilih = 0;

        while (pilih != 6){
            System.out.println("\nDaftar Pegawai");
            System.out.println("1.\t Cari data pegawai");
            System.out.println("2.\t Tambah data pegawai");
            System.out.println("3.\t Perbarui data pegawai");
            System.out.println("4.\t Hapus data pegawai");
            System.out.println("5.\t Daftar seluruh data pegawai");
            System.out.println("6.\t Keluar");

            System.out.print("Masukan pilihan : ");
            pilih = sc.nextInt();

            switch (pilih){
                case 1 :
                    System.out.println("\nCari data pegawai");
                    System.out.print("Masukan id pegawai : ");
                    id = sc.nextInt();
                    pegawai.read(id);
                    break;

                case 2 :
                    System.out.println("\nTambah data pegawai");
                    System.out.print("Masukkan id pegawai : ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan nama pegawai : ");
                    nama = sc.nextLine();

                    System.out.print("Masukan alamat pegawai : ");
                    alamat = sc.nextLine();

                    Pegawai data = new Pegawai(nama , alamat);
                    pegawai.create(id, data);

                    break;
                case 3 :
                    System.out.println("\nPerbarui data pegawai");
                    System.out.print("Masukkan id pegawai : ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan nama pegawai baru : ");
                    nama = sc.nextLine();

                    System.out.print("Masukan alamat pegawai baru : ");
                    alamat = sc.nextLine();

                    Pegawai newData = new Pegawai(nama, alamat);
                    pegawai.update(id, newData);

                    break;
                case 4 :
                    System.out.println("Hapus data pegawai");
                    System.out.print("Masukkan id pegawai : ");
                    id = sc.nextInt();
                    sc.nextLine();

                    pegawai.delete(id);

                    break;
                case 5 :
                    System.out.println("\nDaftar seluruh data pegawai");
                    pegawai.display();
                    break;
                case 6 :
                    System.out.println("\nTerima Kasih!!!");
                    return;
                default:
                    System.out.println("\nInputan salah \nHarap masukan pilihan (1 - 6)\n");

            }

        }
        sc.close();
    }
}
