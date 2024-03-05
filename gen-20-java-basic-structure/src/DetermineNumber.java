import java.util.Scanner;

public class DetermineNumber {
    public static void menentukanAngka (){
        int jumlahAngka = 0;
        int angka = 0;
        Scanner sn = new Scanner(System.in);

        System.out.print("Masukkan jumlah inputan angka : ");
        jumlahAngka = sn.nextInt();

        System.out.println();
        for (int i = 1; i <= jumlahAngka; i++){
            System.out.print("Masukkan angka ke - " + i + " : ");
            angka = sn.nextInt();

            if (angka % 3 == 0 && angka % 2 != 0){
                System.out.println(angka + " adalah angka yang habis dibagi 3 tetapi tidak habis dibagi 2");
                System.out.println();
            } else if (angka % 3 == 0 && angka % 2 == 0) {
                System.out.println(angka + " adalah angka yang habis dibagi 3 dan 2" );
                System.out.println();
            }else if (angka % 2 == 0) {
                System.out.println(angka + " adalah angka yang habis dibagi 2");
                System.out.println();
            }else {
                System.out.println(angka + " adalah angka yang tidak habis dibagi 3 dan 2 ");
                System.out.println();
            }
        }
    }
}

