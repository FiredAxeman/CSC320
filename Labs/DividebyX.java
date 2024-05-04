package Labs;
import java.util.Scanner;
public class DividebyX {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int x;
        
        userNum = scnr.nextInt();
        x = scnr.nextInt();
        
        System.out.print(userNum / x + " ");
        System.out.print(userNum / x / x + " ");
        System.out.println(userNum / x / x / x);
        scnr.close();
        
     }
}
