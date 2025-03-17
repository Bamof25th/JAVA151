import java.util.Scanner;

public class PrimeNumber_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = n / 2;
        int flag = 0;

        if (n == 1 || n == 0) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("prime");
            }
        }
        scn.close();
    }
}
