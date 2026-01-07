package SwtichStatment;
import java.util.Scanner;

public class Vovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the alphabet : ");
        char ch = sc.next().charAt(0);
           ch = Character.toUpperCase(ch);
          
        switch (ch) {
            case 'A', 'E', 'I', 'O', 'U' -> System.out.println("give alphabte is vovel");
            default ->System.out.println("not vovel");
        }
    }
}
