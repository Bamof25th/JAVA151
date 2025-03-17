
import java.util.Scanner;

public class IdentifyingPalindrome_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String st = scn.nextLine();
        int start = 0;
        int end = st.length() - 1;
        while (start != end) {
            if (st.charAt(start) == st.charAt(end)) {
                start++;
                end--;
            } else {
                System.out.println("false");
                break;
            }
        }
        if (start == end) {
            System.out.println("true");
        }
        scn.close();
    }
}
