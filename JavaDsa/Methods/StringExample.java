package Methods;
//string example

public class StringExample {
    // public static void main(String[] args) {
    //     String message = greet();
    //     System.out.println(message);
    // }
    // static String greet(){
    //     String greeting = " hey jaideep how are you ";
    //     return greeting;
    // }

     public static void main(String[] args) {
        String personalized = greet("jaideep");
        System.out.println(personalized);
    }
    static String greet(String name){
        String greeting = "hello " + name;
        return greeting;
    }
}

