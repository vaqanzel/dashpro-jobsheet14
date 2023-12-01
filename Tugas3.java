
import java.util.Scanner;


public class Tugas3 {


    static boolean prim(int n, int start) {


        if (n <= 2) {
            return (n == 2);
        }
        if (n % start == 0) {
            return false;
        }
        if (start * start > n) {
            return true;
        }
        return prim(n, start + 1);


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int bil;
        System.out.print("Apakah bilangan prima? ");
        bil = input.nextInt();
        if (prim(bil, 2)) {
            System.out.print(bil + " adalah bilangan prima");
        } else {
            System.out.print(bil + " Bukan bilangan prima");
        }
        input.close();
    }
}
