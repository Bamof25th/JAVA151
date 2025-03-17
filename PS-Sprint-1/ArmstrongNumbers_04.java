
import java.util.Scanner;

public class ArmstrongNumbers_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int n = temp % 10;
            sum += Math.pow(n, 3);
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
        scn.close();
    }
}
