package Methods;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {2,4,54,24,54};
        Change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Change(int[]num){
        num[0] = 44; // if you make a chAnge a obect via this refference variable the same object will be changed.

    }
}
