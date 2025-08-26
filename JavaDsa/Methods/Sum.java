package Methods;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter number 1: ");
      int a = sc.nextInt();
      System.out.print("enter numbver 2: ");
      int b = sc.nextInt();
    int sum = a+b;
    System.out.println("the sum is = " + sum );
    }
}
