
// Write a program to that copies itself in another file called cade.txt?
/**
 * File
 */
import java.io.*;

public class FilePrg {

    public static void main(String[] args) {
        String filename = "FilePrg.java";
        String newfilename = "cade.txt";
        try {
            File file = new File(filename);
            File newfile = new File(newfilename);
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(newfile);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            fis.close();
            fos.close();
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
