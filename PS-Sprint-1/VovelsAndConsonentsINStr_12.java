
import java.util.Scanner;

public class VovelsAndConsonentsINStr_12 {

    public static void countVovelsAndConsonents(String str){
        int vovels = 0 ;
        int cons = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vovels++;
            }else if(ch >= 'a' && ch <= 'z'){
                cons++;
            }
        }
        System.out.println("Vovels : " + vovels);
        System.out.println("Consonents : " + cons);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        countVovelsAndConsonents(str);
            
        scn.close();
    }
}
