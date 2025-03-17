
import java.util.Scanner;

public class PyramidPatern_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();

        int stars = 0;

        for (int i = 1; i <= height; ++i, stars = 0) {
            for (int space = 1; space <= height - i; ++space) {
                System.out.print(" ");
            }
            while (stars != 2 * i - 1) {
                System.out.print("*");
                ++stars;
            }
            System.out.println();

        }

    }
}
