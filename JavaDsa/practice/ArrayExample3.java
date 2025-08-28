package practice;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] arr = {15, 7, 29, 4};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Max = " + max);
    }
}
