import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumArray {
    public static void tambahArray() {
        int sum = 0;
        int[] newArray  = new int[3];

        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < newArray.length ; i++){
                System.out.print("Masukan element array : ");
                newArray[i] = sc.nextInt();
                sum /= newArray[i];
            }

        } catch (ArithmeticException ae){
            System.err.println("This is Arithmetic Exception");
            ae.printStackTrace();
            System.exit(0);
        } catch (InputMismatchException ime){
            System.out.println("This is Input Mismatch Exception");
            ime.printStackTrace();
            System.exit(0);
        } catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("This is Array Index Out Of Bounds Exception");
            aioobe.printStackTrace();
            System.exit(0);
        }

        System.out.println(Arrays.toString(newArray));
        System.out.println(sum);

    }
}
