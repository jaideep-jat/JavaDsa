
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number  :   ");
        int n = sc.nextInt();

        // for loop(we use for loop when we know how many times the loop is going to run )
        /* syntax: 
        for(initialiazation, condition, increment){
               // body
        }   
        */

       /*   for(int i=1; i<=n; i++){
        //  System.out.print(i + " ");
        System.out.print(" hello world" + " ");
        }
       */ 


      // while loop(we use while loop when we dont know how many times loop is going to run)
      /* syntax: 
         while(condition){
             // body
           }
       */
      
     /*   int num =1;
    while (num <= n) {
        System.out.print(num + " ");
        num++;
    }
     */

    // do while loop(the programe will executes at leat once beacuse first it will 
    // execute the body and then it will check the condition)
    /* syntax: 
    do{
    } while(condition);
     */

    int num = 1;
     do{
        System.out.print(num + " ");
         num += 2;
     }while(num<=n);
     }

    
}
