import java.util.InputMismatchException;
import java.util.Scanner;

public class WhoAmI {
    public static void isMe() throws CustomException{

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String s = sc.next();

        System.out.print("Masukkan Umur Anda : ");
        int age = sc.nextInt();

        if (age < 0 || age > 61) {
            throw new CustomException("Umur melebihi batas");
        } else if (age <= 10){
            System.out.println(s + " Kamu adalah Child");
        } else if (age <= 17 ){
            System.out.println(s + " Kamu adalah Teenagers");
        } else if (age <= 40 ){
            System.out.println(s + " Kamu adalah Man");
        } else if (age <= 60){
            System.out.println(s + " Kamu adalah Wiser");
        }else {
            System.out.println("Sesuaikan dengan umur");
        }
    }
}
