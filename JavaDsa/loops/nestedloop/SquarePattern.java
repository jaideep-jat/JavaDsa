package loops.nestedloop;

public class SquarePattern {
 /*    public static void main(String[] args) {
        for(int i =1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
        */   
// Rectange pattern       
 /*    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=6; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
        */
  //Print numbers from 1 to 5 in each row (5 rows)
  /* public static void main(String[] args) {
    char ch= 'a';
    for(int i=1; i<=5; i++){
        for(int j=1; j<=3; j++){
            System.out.print(ch + " ");
        }System.out.println();
        ch++;
    }
  }  
    */

  public static void main(String[] args) {
    
    // for(int i=1; i<=4; i++){
    //     char ch = 'a';
    // for(int j=1; j<=i; j++){
    //         System.out.print(ch + " ");
    //         ch++;
    //     }System.out.println();
           
    // }

    for(int i=1; i<=4; i++){
        for(int j=1; j<=i; j++){
            System.out.print(i);
        }System.out.println();
    }
  }
}
