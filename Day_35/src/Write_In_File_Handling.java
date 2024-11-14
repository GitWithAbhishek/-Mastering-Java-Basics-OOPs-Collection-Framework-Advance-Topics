import java.io.*;
public class Write_In_File_Handling {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("Aman.txt");
            try{
                f.write("Hello Guys");
            }
            finally {
                f.close();
            }
            System.out.println("File SuccessFully Closed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
