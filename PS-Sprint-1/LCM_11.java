
import java.util.Scanner;

public class LCM_11 {

    public static int FindLCM(int n , int m){
        int ans = 1 ;

        while (true) { 
            if(ans % n == 0 && ans % m == 0){
                break;
            }
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int ans = FindLCM(n,m);

        System.out.println(ans);

        scn.close();
    }
}
