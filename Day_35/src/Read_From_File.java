import java.io.*;
public class Read_From_File {
    public static void main(String[] args) throws Exception {
        FileReader f = new FileReader("Aman.txt");
        int i;
        while((i=f.read())!=-1){
            System.out.print((char)i);
        }
    }
}
