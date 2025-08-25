package SwtichStatment;
import java.util.Scanner;
public class NestedSwitch{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the enploye number : ");
    int employe = sc.nextInt();
    System.out.print("enter the department of the employe : ");
    String department = sc.next();

    switch(employe){
    case 1 -> System.out.println("rahul jat");
    case 2 -> System.out.println("jaideep jat");
    case 3 -> System.out.println("ravi jat");
    case 4 -> { System.out.println("employe 3");
    switch (department){
        case "Id" -> System.out.println("it department");
        case "managment" -> System.out.println("managment department");
        default -> System.out.println("enter the valid string");
        } }
        default -> System.out.println("enter the valid employe number ");


}}
}
