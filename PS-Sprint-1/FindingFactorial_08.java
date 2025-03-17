
import java.util.Scanner;

public class FindingFactorial_08 {
    public static long getFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = n * getFactorial(n - 1);

        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();

        long ans = getFactorial(number);

        System.out.println("factorial of "+ number + " is :" + ans);

        scn.close();

    }
}
