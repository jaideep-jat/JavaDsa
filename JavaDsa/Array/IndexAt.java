package Array;
import java.util.Scanner;

public class IndexAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.print("enter the number : ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        
        System.out.print("enter the x : ");
        int x = sc.nextInt();

        boolean found = false;

        for(int i=0; i<=number.length; i++){
         if (number[i] == x) {
               System.out.print("found at index : " + i);
               found = true;
          break;
        }
    } if (!found ) {
        System.out.println("number is not available");
    }
}
}
