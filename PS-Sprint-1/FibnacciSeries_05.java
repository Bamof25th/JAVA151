import java.util.Scanner;

public class FibnacciSeries_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        System.out.print(n1 + " , " + n2);
        for (int i = 2; i < count - 3; i++) {
            temp = n1 + n2;
            System.out.print(", " + temp);
            n1 = n2;
            n2 = temp;
        }
        scn.close();
    }
}
