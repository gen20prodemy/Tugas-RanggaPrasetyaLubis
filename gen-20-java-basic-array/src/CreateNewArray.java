import java.util.Arrays;
import java.util.Scanner;

public class CreateNewArray {

    public static void printNewArray() {
        int rowCol;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah baris dan kolom : ");
        rowCol = sc.nextInt();//inputan untuk menentukan jumlah baris dan kolom

        int[][] arr = new int[rowCol][rowCol];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print("Masukan nilai baris ke " + (i + 1)+ " kolom ke " + (j + 1) + " : "); // perulangan untuk menginputkan elemen pada array
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Berikut adalah hasil inputan 2 array yang akan dijumlah : " + Arrays.deepToString(arr)); //menampilkan hasil dari inputan array
        addNewArray(arr); // menampilkan array baru dari hasil penjumlahan 2 array

    }
    public static int[] addNewArray(int[][] arr){
        int[] addArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr.length; j++){ // menambahkan setiap elemen pada array
                sum += arr[i][j];
            }
            addArray[i] = sum; // membuat array baru dari penjumlahan 2 array
        }
        System.out.println("Hasil dari penjumlahan 2 array = " + Arrays.toString(addArray));
        return addArray;
    }
}
