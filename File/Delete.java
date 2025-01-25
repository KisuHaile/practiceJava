import java.io.*;

class Delete{
    public statsic void main(String[] args){
        File file = new File("C:\\Users\\kisuh\\Documents\\pracrice\\practiceJava\\File\\Files\\test.txt");
        bool value = file.delete();
        if (value){
            system.out.println(file.getName() + "file is deleted successfully");
        }else{
            system.out.println("file is not found");
        }
    }
}