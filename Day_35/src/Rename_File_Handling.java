import java.io.*;
public class Rename_File_Handling {
    public static void main(String[] args) {
        File f =new File("Aman.txt");
        File f2 =new File("After_Name.txt");
        if(f.exists()){
            System.out.println(f.renameTo(f2));
        }
        else {
            System.out.println("File Doesn't Exist");
        }
    }
}
