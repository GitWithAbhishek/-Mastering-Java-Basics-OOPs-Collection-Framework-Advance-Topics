import java.io.*;
public class Display_File_Information {
    public static void main(String[] args) {
        File f = new File("Sandeep.txt");
        if(f.exists()){
            System.out.println("File Name Is "+f.getName());
            System.out.println("File Location "+f.getAbsolutePath());
            System.out.println("Is File Writeable "+f.canWrite());
            System.out.println("Is File Readable "+f.canRead());
            System.out.println("File Size "+f.length());
            System.out.println("File Is Removed "+f.delete());
        }
        else{
            System.out.println("File Doesn't Exist :(");
        }
    }
}
