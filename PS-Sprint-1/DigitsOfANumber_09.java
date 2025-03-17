
import java.util.Scanner;

public class DigitsOfANumber_09 {

    public static int DigitsOfANum(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp;
             n = n/10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = DigitsOfANum(n);

        System.out.println(ans);

        scn.close();

    }

}
