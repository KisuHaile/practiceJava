import java.io.*;

public class fileinfo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kisuh\\Documents\\pracrice\\practiceJava\\File\\Files\\Fileinfo.txt");
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
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
            System.out.println("path of the file" + file.getPath());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
