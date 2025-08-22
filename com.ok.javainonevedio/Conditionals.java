import java.util.Scanner;

public class Conditionals {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the salary of the employe : ");
    int salary= sc.nextInt();
     if(salary==2500) {
    System.out.println("employe's salary is god ");
    }else if(salary>=2500){
      System.out.println("salary is alsoo good");
    }else{
        System.out.println("employe salary is not good ");
    }
}
}