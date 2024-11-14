import java.io.*;
public class Creating_New_File {
    public static void main(String[] args) throws Exception {
        File f = new File("Sandeep.txt");
        if(f.createNewFile()){
            System.out.println("File Created SuccessFully");
        }
        else{
            System.out.println("File Doesn't Exist");
        }
    }
}
