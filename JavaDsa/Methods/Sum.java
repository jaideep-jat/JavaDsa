package Methods;
import java.util.Scanner;
public class Sum {

    // static void sum(){
    //   Scanner sc = new Scanner(System.in);
    //   System.out.print("enter number 1: ");
    //   int a = sc.nextInt();
    //   System.out.print("enter numbver 2: ");
    //   int b = sc.nextInt();
    // int sum = a+b;
    // System.out.println("the sum is = " + sum );

 // THIS METHOD IS FOR RETURNING THE VALUE 
    
 //  public static void main(String[] args) {
     //         int ans = sum2();
     //         System.out.println(ans);
     //     }  
    // static int sum2(){
    //   Scanner sc = new Scanner(System.in);
    //   System.out.print("enter number 1: ");
    //   int a = sc.nextInt();
    //   System.out.print("enter numbver 2: ");
    //   int b = sc.nextInt();
    //    int sum = a+b;
    //     return sum; // when we use return means everything is over nothing will execute after that
    
 // pass the number of value when are calling the method in main()   

    public static void main(String[] args) {
        int ans = sum3(20,40);
        System.out.println(ans);
    }
      static int sum3(int a, int b){
      int sum = a+b;
      return sum;
      }
    }

