import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Membuat Array list dengan objek sesuai dengan tipe produk
        ArrayList<Food> listFood = new ArrayList<>();
        ArrayList<Beverage> listBeverage = new ArrayList<>();
        ArrayList<Medicine> listMedicine = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah produk : ");
            int jlh = scan.nextInt();
            scan.nextLine();
            System.out.println();

            for (int i = 0; i < jlh; i++){ // perulangan untuk mengambil inputan
                System.out.printf("Masukkan nama produk ke - %d : ", i+1 );
                String productName = scan.nextLine();

                System.out.printf("Masukkan harga produk ke - %d : ", i+1);
                Integer priceProduct = scan.nextInt();

                System.out.println("Pilih Kategori Produk");
                System.out.println("1. makanan ");
                System.out.println("2. minuman ");
                System.out.println("3. obat ");
                System.out.print("Pilih kategori : ");
                int pilih = scan.nextInt();
                scan.nextLine();
                System.out.println();

                if (pilih == 1){
                    listFood.add(new Food("Makanan", productName, priceProduct)); //menambahkan object ke array list food
                } else if (pilih == 2){
                    listBeverage.add(new Beverage("Minuman", productName, priceProduct)); //menambahkan object ke array list beverage
                } else if (pilih == 3) {
                    listMedicine.add(new Medicine("Obat", productName, priceProduct)); //menambahkan object ke array list medicine
                } else {
                    System.out.println("Inputan Salah");
                    return;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }

        //Perulangan untuk menampilkan isi array
        System.out.println("=== Daftar Produk ===");
        for(Food listProductFood : listFood){
            listProductFood.displayProduct();
        }
        for (Beverage listProductBeverage : listBeverage){
            listProductBeverage.displayProduct();
        }
        for (Medicine listProductMedicine : listMedicine){
            listProductMedicine.displayProduct();
        }
        scan.close();
    }
}
