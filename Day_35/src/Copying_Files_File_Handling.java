import java.io.*;
public class Copying_Files_File_Handling {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("Aman.txt");
        FileOutputStream w = new FileOutputStream("Naman.txt");

        int i;
        while((i=r.read())!=-1){
            w.write((char)i);
        }
        System.out.println("Data Copied SuccessFully");
    }
}
