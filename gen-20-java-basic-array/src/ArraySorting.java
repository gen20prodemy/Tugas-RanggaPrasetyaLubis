import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void printSortArray() {

        Scanner sa = new Scanner(System.in);
        System.out.print("Masukan jumlah array : ");
        int n = sa.nextInt(); // mengambil inputan array
        System.out.println();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){ // perulangan untuk menginputkan elemen pada array
            System.out.print("Masukkan angka " + (i+1) + " : ");
            arr[i] = sa.nextInt();
        }
        System.out.println();
        System.out.println("Hasil Array dari inputan : " + Arrays.toString(arr));
        System.out.println("Array yang sudah diurutkan dari terkecil ke terbesar : " + Arrays.toString(ascendingArray(arr)));
        System.out.println("Array yang sudah diurutkan dari terbesar ke terkecil : " + Arrays.toString(descendingArray(arr)));
    }

    public static int[] ascendingArray (int[] arr){// method sorting dari terkecil ke terbesar
        int temp; // sebagai penampung data sementara

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] descendingArray (int[] arr){// method sorting dari terbesar ke terkecil
        int temp; // sebagai penampung data sementara

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}


