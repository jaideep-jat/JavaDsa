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
}
}