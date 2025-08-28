package practice;

import java.util.Scanner;
public class ArrayExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];  // size 3 array
        System.out.println("Enter 3 numbers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("You entered:");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}

