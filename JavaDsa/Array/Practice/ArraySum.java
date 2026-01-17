package Array.Practice;

public class ArraySum {
    public static void main(String[] args) {
        int arr[] = {23,3,4,65};
        int sum =0;;
        for(int i=0; i<arr.length; i++ ){
           sum= sum + arr[i];
          //  System.out.print(sum);
        }System.out.println(sum);
    }
}
