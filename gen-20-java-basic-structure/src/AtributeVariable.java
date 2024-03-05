import java.util.Scanner;

public class AtributeVariable {
    public static void main (String[] args){
        String n;

        Scanner sn = new Scanner(System.in);

        System.out.print("Nama : ");
        n = sn.next();

        System.out.println("Nama kamu adalah : " + n);
    }
}
