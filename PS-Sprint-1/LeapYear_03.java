import java.util.Scanner;

public class LeapYear_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int year = scn.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("True");
        } else {

            System.out.println("False");
        }
        scn.close();
    }
}
