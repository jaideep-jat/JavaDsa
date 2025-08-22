package loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number : ");
        int a = sc.nextInt();
        System.out.print("enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.print("enter the 3rd number : ");
        int c = sc.nextInt();

       /*  int max= a;
        if (b>max) {
            max = b ;
        }
        if(c>max){
            max = c;
        }
        System.out.println(" the maximum number is " +  max );
    }
        */
        int max =Math.max(c, Math.max(a, b));
        System.out.println(max);
}
}