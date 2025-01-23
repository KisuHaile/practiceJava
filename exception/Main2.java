public class Main2 {
    public static void main(String[] args){
        try {
            // System.out.println("inside the try block");
            int data = 25/0;
            // System.out.println(data);
        } 
        // catch (ArithmeticException kisu) {
        //     System.out.println(kisu);
        // }
        finally{
        System.out.println("After try-catch block the finally will be always executed");
        }
        // System.out.println("rest of code");
    }
}
