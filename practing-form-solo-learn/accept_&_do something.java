import java.util.Scanner;

class accept {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter your ID number");
        int num = input.nextInt();

       
        System.out.println("Enter your name");
        String name = input.next(); 

       
        System.out.println("Enter your father name");
        String f_name = input.next(); 

       
        System.out.println("Enter your age");
        int age = input.nextInt(); 
        
        System.out.println("Where do you learn");
        String uni = input.next(); 

        
        System.out.println("Enter your grade");
        double grade = input.nextDouble();

        
        System.out.println("Enter the current year");
        int c_year = input.nextInt(); 

        
        int born = c_year - age;

        
        System.out.print("My ID number is " + num + " and my name is " + name + " " 
        + f_name + ". I am " + age + " years old. And I was born in " + born + 
        ". I learn in a university called " + uni + " and my grade is " + grade + ".");

        input.close(); 
    }
}
