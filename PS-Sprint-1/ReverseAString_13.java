import java.util.Scanner;

public class ReverseAString_13 {

    public static void reverseString(String str){
        String rev = "";
        char ch ;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }

        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        reverseString(str);
        scn.close();
    }
}
