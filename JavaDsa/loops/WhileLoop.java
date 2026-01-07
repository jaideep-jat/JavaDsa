
package loops;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
    }
}
