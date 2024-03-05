import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Print seluruh method
        System.out.println("Menginputkan nama ke dalam Array List lalu di konversi \n");
        ArrayList<String> namaArrayList = inputListNama(); // inisialisasi Array List dengan method
        System.out.println();
        LinkedList<String> namaLinkedList = printToLinkedList(namaArrayList);// inisialisasi Linked List dengan method yang berisikan parameter array list sebelumnya
        System.out.println();
        HashSet<String> namaHashSet = printToHashSet(namaArrayList);// inisialisasi Hash Set dengan method yang berisikan parameter array list sebelumnya
        System.out.println();
        TreeSet<String> namaTreeSet = printToTreeSet(namaArrayList);// inisialisasi Tree Set dengan method yang berisikan parameter array list sebelumnya

    }

    public static ArrayList<String> inputListNama(){
        int stop = 0; // variable batasan input

        Scanner scan = new Scanner(System.in);
        System.out.print("Berapa nama yang akan di input : "); // mengambil batasan input
        stop = scan.nextInt();
        System.out.println();

        ArrayList<String> names = new ArrayList<>(); // inisialisasi object names

        for (int i = 0; i < stop; i++){ //perulangan dalam memasukkan nama
            System.out.print("Masukkan Nama : ");
            String n = scan.next();
            names.add(n); // menambah nama pada object
        }

        System.out.println();
        System.out.println("=== Daftar List Nama Menggunakan Array List ==="); // proses menampilkan nama yang sudah di inputkan
        for (int i = 0; i < names.size(); i++){
            System.out.println((i + 1) + " " + names.get(i));
        }
        scan.close();

        return names;
    }

    public static LinkedList<String> printToLinkedList(ArrayList<String> listNama){ // method untuk mengubah Array List to Linked List

        LinkedList<String> namaLinkedList = new LinkedList<>(listNama); // inisialisasi object linked list dengan paramater array list

        System.out.println("=== Daftar List Nama Menggunakan Linked List ==="); // proses menampilkan nama
        for (String nama : namaLinkedList){
            System.out.println(nama);
        }
        return namaLinkedList;
    }

    public static HashSet<String> printToHashSet (ArrayList<String> listNama){ // method untuk mengubah Array List to Hash Set

        HashSet<String> namaHashSet = new HashSet<>(listNama); // inisialisasi object hash set dengan paramater array list

        System.out.println("=== Daftar List Nama Menggunakan Hash Set ==="); // proses menampilkan nama
        for (String nama : namaHashSet){
            System.out.println(nama);
        }
        return namaHashSet;
    }

    public static TreeSet<String> printToTreeSet (ArrayList<String> listNama){ // method untuk mengubah Array List to Hash Set

        TreeSet<String> namaTreeSet = new TreeSet<>(listNama); // inisialisasi object tree set dengan paramater array list

        System.out.println("=== Daftar List Nama Menggunakan Tree Set ==="); // proses menampilkan nama
        for (String nama : namaTreeSet){
            System.out.println(nama);
        }
        return namaTreeSet;
    }
}
