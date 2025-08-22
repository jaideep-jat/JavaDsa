package loops;
import java.util.Scanner;
public class CaseCheck {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the word : ");
      char ch = sc.next().trim().charAt(0);
      /*
       * trim() - is used for trimming the extra space from the output.
       * charAt() - is used hear for character at zeroth index in the output
       */
      if (ch >= 'a' && ch<= 'z') {
        System.out.println("the given string is lower case ");
        }
      else{
        System.out.println("the string is upper case ");
      }  
    }
}
