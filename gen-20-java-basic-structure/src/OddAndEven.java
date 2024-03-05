import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 0;
        int result = 0;

        // Inputan dari user dengan class scanner sebagai tipe data
        Scanner sn = new Scanner(System.in); // Mengambil inputan user dengan membuat object baru dari class scanner

        System.out.println("Menentukan bilangan ganjil/genap dengan menjumlahkan 2 bilangan ditambah 1");
        System.out.print("Masukkan angka 1 : ");
        n1 = sn.nextInt();
        System.out.print("Masukkan angka 2 : ");
        n2 = sn.nextInt();
        // Mengambil inputan user dengan method nextInt
        // nextInt adalah method untuk memproses inputan dari user yg bertipe data integer

        result = n1 + n2 + 1; // Proses penjumlahan 2 bilangan ditambah 1

        if (result % 2 != 0){ // Pengkondisian apabila sisa bagi dari result dibagi 2 != 0
            System.out.println(result + " merupakan bilangan ganjil"); // menampilkan hasil
        } else {
            System.out.println(result + " merupakan bilangan genap"); // menampilkan hasil
        }
    }
}
