package Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 23;
        int b = 44;
        // int result = marks();
        // System.out.println(result);
        {
            // int a = 24; //here it will not get changes becasue it is in same function
            a = 24; // here it will be axecute becuse here i am reasinging the value
        System.out.println(a); // it will show the value of a is 24
        }
       System.out.println(a); // here it will show the value of a is 21 coz its out of that block
    
    // static int marks(){
    //   int num = 45;
    //   return num;
   
// scoping in for loop
  for(int i=1; i<=4; i++){
    i=2;
    System.out.println(i);
  }
  
 //  System.out.println(i);  cannot access this i outside this for loop
}
}


