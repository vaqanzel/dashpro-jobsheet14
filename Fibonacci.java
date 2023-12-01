import java.util.Scanner;
public class Fibonacci {
    static int fiboo(int n) {
        if (n <= 1) {
            return (n);
        } else {
            return fiboo(n - 1) + fiboo(n - 2);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int bulan;
        System.out.print("Bulan ke: ");
        bulan = input.nextInt();
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " : " + fiboo(bulan));
        input.close();
    }
}
