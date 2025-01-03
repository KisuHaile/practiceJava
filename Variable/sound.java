class Animal {
    void makeSound(){
        System.out.println("rrrrr....");
    }
}
class Cat extends Animal {
    void makeSound(){
        System.out.println("Meom....");
    }
}
public class sound{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}