import java.util.Scanner;

public class ArithmethicProgression {
    public static int sumNumber(){
        int sukuN = 0;
        int sukuPertama = 0;
        int selisihAngka = 0;
        int totalAngka = 0;

        Scanner sn = new Scanner(System.in);
        System.out.print("Masukan suku ke N : ");
        sukuN = sn.nextInt();

        System.out.print("Masukan nilai pertama : ");
        sukuPertama = sn.nextInt();

        System.out.print("Masukan selisih angka : ");
        selisihAngka = sn.nextInt();

        for (int i = 1; i <= sukuN; i++){
            totalAngka = sukuN/2 * (2 * sukuPertama + (sukuN - 1) * selisihAngka ); // Rumus untuk mencari jumlah deret
        }
        return totalAngka;
    }
}
