public class Main1 {
    public static void main(String[] args){
        int num[]={7,1,12,19,16,19};
        try {
            System.out.println("num[0] "+num[0]);
            System.out.println("num[1] "+num[1]);
            System.out.println("num[2] "+num[2]);
            System.out.println("num[3] "+num[3]);
            System.out.println("num[4] "+num[4]);
            // System.out.println("num[7] "+num[7]);
            // int divideByZero = 5/0;
            // System.out.println(divideByZero);
        } catch (ArrayIndexOutOfBoundsException kisanet) {
            System.out.println("Array out of the bound");
        }
        System.out.println("num[7] "+num[7]);
    }
}
