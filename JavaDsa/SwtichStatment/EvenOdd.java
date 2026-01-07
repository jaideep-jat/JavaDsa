package SwtichStatment;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();

      /*   switch (1) {
            case 1:
              if ( num % 2 ==0) {
                System.out.println("the given number is even");
              }else{
                System.out.println("the number is odd");
              }
              break;
            }
       */
      
              switch (num%2) {
                case 0 -> System.out.println("number is even");
              case 1 -> System.out.println("the number is odd");   
                
              }
        }
    }
