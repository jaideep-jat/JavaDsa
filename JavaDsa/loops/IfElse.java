package loops;

import java.util.Scanner;

public class IfElse{
    // public static void main(String[] args) {
        
   
    // int salary = 23000;
    // if(salary>10000){
    //    salary = salary+1000;
    // }else{
    //     salary = salary - 1000;
    // }
    // System.out.println(salary);
    // }


// multiple if else statements
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter your age");
   int age = sc.nextInt();
    if (age>18) {
        System.out.println("eligible for licence");
    } else if (age>=18) {
        System.out.println("eligibe");
    }else{
        System.out.println("not eligible");
    }
}



}