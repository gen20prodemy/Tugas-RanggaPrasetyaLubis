import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Penjumlahan elemen array ===");
        ArraySum.printArraySum();
        System.out.println();
        System.out.println("=== Mengurutkan elemen aray ===");
        ArraySorting.printSortArray();
        System.out.println();
        System.out.println("=== Membuat array baru dari penjumlahan 2 array ===");
        CreateNewArray.printNewArray();

        System.out.println("\n");

        //////////////////////////////////////////
        readFile(); //print method untuk membaca file
        System.out.println();
        writeFile(); //print method untuk menulis file

    }

    public static void readFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));//membaca sebuah file
            String line;
            while ((line = reader.readLine()) != null){//perulangan untuk membaca setiap string
                System.out.println(line);//menampilkan isi file
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));//menulis sebuah nama file
            writer.write("Heal The World");//isi dari file
            System.out.println("Berhasil Menulis File");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

