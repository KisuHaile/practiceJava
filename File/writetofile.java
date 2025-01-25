import java.io.*;

public class writetofile {
        public static void main(String[] args) {
        File file = new File("C:\\Users\\kisuh\\Documents\\pracrice\\practiceJava\\File\\Files\\filewrite.txt");
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
        file.write("Hello World");
        file.close();
        System.out.println("Data written to the file.");
        
    }
}
