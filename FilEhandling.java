import java.io.File;
import java.io.IOException;


public class FilEhandling {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\myTestFile.txt");//This is how file created in windows
        try {
            f.createNewFile();
        } catch (IOException e) {//
            e.printStackTrace();
        }
        System.out.println("File Created Successfully!!!");
    }
}
