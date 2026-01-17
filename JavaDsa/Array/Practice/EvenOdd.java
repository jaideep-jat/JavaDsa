package Array.Practice;

public class EvenOdd {
  public static void main(String[] args) {
    int arr[]= { 3,5,7,9,8,6};
    int even =0;
    int odd=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i] %2==0){
            even++;
        }if (arr[i] %2 != 0) {
            odd++;
        } 
    }System.out.println("even numbers are : " + even + "\n" + "odd numbers are : " + odd  );
    }
  } 

