package SwtichStatment;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the fruite name : ");
        String fruite = in.next();

        switch (fruite) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "banana":
                 System.out.println("good for weight gain");
                 break;
            case "kiwi":
                 System.out.println("doof for health ");
                 break;
            case "apple":
                 System.out.println("one apple a day keeps a dr away ");
                 break;
            default:
            System.out.println("please enter the valid fruite");

        }

    }
}
