package SwtichStatment;
import java.util.Scanner;
public class Frute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the frute name : ");
        String fruite = in.next();

     switch (fruite) {
        case "mango" ->System.out.println("king of fruites");
        case "apple" ->System.out.println("a apple a day keeps a dr away");
        case "banana" ->System.out.println("good for weight gain");
        case "orange" ->System.out.println("its colour is orange ");
        case "kiwi" ->System.out.println("good for health");
    default -> System.out.println("this statement is false");
    }

     System.out.print("enter the number : ");
    int days = in.nextInt();
   
    
    switch (days){
    //     case 1 -> System.out.println("monday");
    //     case 2 -> System.out.println("tuesday");
    //     case 3 -> System.out.println("thursday");
    //     case 4 -> System.out.println("friday");
    //     case 5 -> System.out.println("wednesday");
    //     case 6 -> System.out.println("saturday");
    //     case 7 -> System.out.println("sunday");
    //     default -> System.out.println("the statement is wrong ");
    
    case 1, 2, 3, 4, 5 -> System.out.println("weekday");
    case 6, 7 -> System.out.println("weekend");
}
    }
}
