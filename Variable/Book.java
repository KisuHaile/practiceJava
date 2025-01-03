
import java.util.Scanner;

public class Book{

    String title, A_name;
    float price;

    Book(String title, String name){
        this.title = title;
        this.A_name = name;
    }
    Book(String title, String name,float price){
        this.title = title;
        this.A_name = name;
        this.price = price;
    }
    public void print(){
        System.out.println("Book's title " + title);
        System.out.println("Book's Author name " + A_name);
        System.out.println("Book's price " + price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the book's Title: ");
        String title = input.nextLine();

        System.out.println("What is the book's author name: ");
        String name = input.nextLine();

        System.out.println("What is the book's price: ");
        float price = input.nextFloat();

        Book reader = new Book(title, name, price);

        reader.print();
        
    
        input.close();
    }
}