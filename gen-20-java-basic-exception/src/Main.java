public class Main {
    public static void main(String[] args)  throws CustomException{

        System.out.println("=== Penggunaan Try Catch ===");
        SumArray.tambahArray();

        System.out.println("=== Penggunaan Throw ===");
        PrintNumber.angka();

        System.out.println("=== Penggunaan Custom Exception ===");
        WhoAmI.isMe();
    }
}
