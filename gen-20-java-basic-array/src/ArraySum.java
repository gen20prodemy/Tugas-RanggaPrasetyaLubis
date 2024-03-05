import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void printArraySum() {

        Scanner sa = new Scanner(System.in);
        System.out.print("Masukan jumlah array : ");
        int n = sa.nextInt(); //mengambil inputan array
        System.out.println();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){ // perulangan untuk menginputkan elemen pada array
            System.out.print("Masukkan angka " + (i+1) + " : ");
            arr[i] = sa.nextInt();
        }
        System.out.println();
        System.out.println("Hasil Array dari inputan : " + Arrays.toString(arr));
        System.out.println("Hasil penjumlahan array : " + sumArray(arr));
    }

    public static int sumArray(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++){// proses untuk menjumlahkan setiap elemen array
            sum = sum + arr[i];
        }

        return sum;
    }
}
