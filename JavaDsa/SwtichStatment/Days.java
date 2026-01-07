package SwtichStatment;
import java.util.Scanner;
public class Days {
    /**
      //@param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the case : ");
        int day = sc.nextInt();
       
        switch (day) {
         case 1 -> System.out.println(" monday");
         case 2 -> System.out.println(" tuesday");
         case 3 -> System.out.println(" wednesday");
         case 4 -> System.out.println(" thursday");
         case 5 -> System.out.println(" friday");
         case 6 -> System.out.println(" saturday");
         case 7 -> System.out.println(" sunday");
        default -> System.out.println("the system is wrong");
        }

               
        switch (day) {
           
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7-> System.out.println(  "weekends");
        }
        }
    }

