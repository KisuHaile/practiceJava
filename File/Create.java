import java.io.*;
class Creat{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kisuh\\Documents\\pracrice\\practiceJava\\File\\Files\\test.txt");
        try {
            boolean fil = file.createNewFile();
            if (fil) {
                System.out.println("File created: ");
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println( e );
        }
    }    
}