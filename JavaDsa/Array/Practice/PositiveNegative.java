package Array.Practice;
public class PositiveNegative {
    public static void main(String[] args) {
        int arr[]= {2, 4, -6, 23, -9, 0, 0};
       
            int negative =0;
            int positive = 0;
            int zeros =0;

            for(int i =0; i<=arr.length-1; i++){
                if (arr[i]<0) {
                    negative++;
                } else if (arr[i]>0) {
                    positive++;
                }else {
                    zeros ++;
                }
                    
                }System.out.println(" number of negative element : " + negative);
                System.out.println(" number of positive element : " + positive);
                System.out.println(" number ofzero element : " + zeros);
            }
        }
   
