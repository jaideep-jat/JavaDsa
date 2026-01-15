package Array;

public class Maximum {
    public static void main(String[] args) {
  
    int  number[] = {23, 43, 55, 53, 78};
    int max = number[0];

    for(int i=0; i<number.length; i++){
        if(number[i]>max){
          max = number[i];
        }
    }
    int slargest= -1;
    for(int i=0; i<number.length; i++){
        if(number[i]> slargest && number[i] != max){
            slargest = number[i];
        }
    }System.out.println(slargest);
}
}
