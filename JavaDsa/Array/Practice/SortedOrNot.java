package Array.Practice;
import java.util.Scanner;
public class SortedOrNot {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the length of an array : ");
     int n = sc.nextInt();
     int arr[]= new int[n];
     System.out.print("enterr the elements in an array : ");
    // boolean inshorted = true;  
     

     for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
     }
     
     boolean isSort =true;
     for(int i=0; i<n-1; i++){
        if (arr[i]>arr[i+1]) {
            isSort = false;
            break;
        }
     }
     
    //  for(int i=0; i<n; i++){
    //     System.out.print(arr[i] + " ");
    //     if (arr[i]<arr[i+1]) {
    //         System.out.println("array is an sorted array");
    //     }else{
    //         System.out.println("array is not sorted");
    //     }
    //  }
     if (isSort) {
        System.out.println("array is sorted");
    }else{
        System.out.println("array is not sorted ");
    }
}
}

