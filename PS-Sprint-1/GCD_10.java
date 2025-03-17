
import java.util.Scanner;

public class GCD_10 {

    public static int FindGCD( int n ,int m ){
        int ans  = 0;
        int l = n;
        if( m < n) {
            l = m;
        }
         for (int i = l; i > 1; i--) {
            if(m%i == 0 && n%i ==0){
                ans = i;
                break;
            }
         }
            return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int ans = FindGCD(n,m);

        System.out.println(ans);

        scn.close();

    }
}
