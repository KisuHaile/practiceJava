class demo {
    public int myMethod(int num1, int num2){
        System.out.println("First my method of class demo");
        return num1+num2;
    }
    public int myMethod(int var1, int var2){
        System.out.println("Second myMethod od class demo");
        return var1-var2;
    }
}
class sample4{
    public static void main(String[] args) {
        demo obj1 = new demo();
        obj1.myMethod(10,10);
        obj1.myMethod(20,12);
    }
}