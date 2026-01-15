package Array;
//rever the array
public class Reverse {
    public static void main(String[] args) {
        int arr[] = {23, 54, 23, 12};
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
