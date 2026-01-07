package SwtichStatment;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number 1: ");
        int a = sc.nextInt();
        System.out.print("enter the operator: ");
        char op = sc.next().charAt(0);
        System.out.print("enter the 2nd number: ");
        int b = sc.nextInt();
        int ans =0;

       switch (1) {
        case 1:
            if (op == '+') {
                ans = a +b;
            }else if (op == '-') {
                ans = a-b;
            } else if(op == '*') {
                ans = a*b;
            }else if(op == '/'){
                ans = a/b;
            }else{
                System.out.println("invalid operator");
            }
            System.out.println(ans);
            break;
            

    }
}
}