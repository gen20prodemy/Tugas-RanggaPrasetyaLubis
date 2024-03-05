import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int a1 = 0, a2 = 0, result = 0;
        char op = 0;

        // Inputan dari user dengan class scanner sebagai tipe data
        Scanner sn = new Scanner(System.in); // Mengambil inputan user dengan membuat object baru dari class scanner

        System.out.println("Kalkulator Sederhana\n");
        System.out.print("masukan angka 1 : ");
        a1 = sn.nextInt();
        System.out.print("masukan angka 2 : ");
        a2 = sn.nextInt();
        // Mengambil inputan user dengan method nextInt
        // nextInt adalah method untuk memproses inputan dari user yg bertipe data integer

        System.out.println();
        System.out.println("t = tambah ");
        System.out.println("m = kurang ");
        System.out.println("b = bagi ");
        System.out.println("k = kali ");
        System.out.print("masukan operasi : ");
        op = sn.next().charAt(0);
        // Mengambil inputan user dengan method next()
        // next adalah method untuk memproses inputan dari user yg bertipe string
        // chartAt(0) adalah fungsi untuk mengembalikan nilai character pertama dari string

        if (op == 't') { // pengkondisian apabila inputan dari user adalah t
            result = a1 + a2; // proses penjumlahan
            System.out.println("Hasil dari " + a1 + " + " + a2 + " = " + result);
        } else if (op == 'm') { // pengkondisian apabila inputan dari user adalah m
            result = a1 - a2; // proses pengurangan
            System.out.println("Hasil dari " + a1 + " - " + a2 + " = " + result);
        } else if (op == 'b') { // pengkondisian apabila inputan dari user adalah b
            result = a1 / a2; // proses pembagian
            System.out.println("Hasil dari " + a1 + " : " + a2 + " = " + result);
        } else if (op == 'k') { // pengkondisian apabila inputan dari user adalah k
            result = a1 * a2; // proses perkalian
            System.out.println("Hasil dari " + a1 + " x " + a2 + " = " + result);
        } else { // kondisi lain apabila inputan tidak sesuai
            System.out.println("Operasi yang anda masukan salah");
        }

    }

}
