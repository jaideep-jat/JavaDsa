package Array;
 import java.util.Scanner;
public class Array{
  public static void main(String[] args) {
    // int marks[] = new int [3];
    // marks[0] = 98; // english
    // marks[1] = 92; // physics
    // marks[2] = 95; // chemistry

    // for(int i =0; i<3; i++){
    //   System.out.print(marks[i] + " ");
    // }
    

    // take array size as a input
     
    Scanner sc = new Scanner(System.in);
    System.out.print( " enter the size of array : ");
    int n = sc.nextInt();
    int marks[] = new int [n];
    System.out.print("enter the marks : ");
      
    for(int i=0; i<n; i++){
      
      marks[i] = sc.nextInt();
        }

   for(int i =0; i<n; i++){
    System.out.print(marks[i] + " ");
   }
  }
}



