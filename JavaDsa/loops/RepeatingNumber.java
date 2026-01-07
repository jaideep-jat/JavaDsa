package loops;

public class RepeatingNumber {
   /* public static void main(String[] args) {
        int n = 565656;
        int count =0;
        while (n>0) {
            int rem = n%10;
            if (rem == 5) {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    } */


// reverse the array 64576

public static void main(String[] args) {
    int num = 64576;
    int ans =0;
   while (num >0) {
    int rem = num %10;
    num /= 10;
    ans = ans * 10 + rem;
   }
   System.out.print(ans);
}
}
