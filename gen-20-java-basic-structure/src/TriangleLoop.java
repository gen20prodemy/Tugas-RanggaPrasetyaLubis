import java.util.Scanner;

public class TriangleLoop {
    public static void main(String[] args){
        int n = 0;

        // Inputan dari user dengan class scanner sebagai tipe data
        Scanner sn = new Scanner(System.in); // Mengambil inputan user dengan membuat object baru dari class scanner

        System.out.println("Membuat segitiga dengan * ");
        System.out.println();
        System.out.print("Masukkan jumlah baris : ");
        n = sn.nextInt(); // Mengambil inputan user dengan method nextInt
        // nextInt adalah method untuk memproses inputan dari user yg bertipe data integer

        for (int x = 1; x <= n; x++){ // perulangan baris
            for (int y = 1; y <= x; y++){ // perulangan menampilkan bintang
                System.out.print(" * "); // menampilkan bintang
            }
            System.out.println(); // menambahkan baris baru
        }
    }
}
