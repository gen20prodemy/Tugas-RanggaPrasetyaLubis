import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintNumber {
    public static void angka() {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan bilangan positif : ");
        n = sc.nextInt();

        if (n < 0 ){
            throw new InputMismatchException("Error Input");
        }
    }
}
