import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class wrIteFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("E:\\myTestFile",true);
      // fw.write("I am the Earth \n");
        //fw.write("I am the moon \n");
        //fw.write("I am the sun \n");
        fw.write("hello \n");
        fw.flush();//flush clears the the data in flush memory an writes in the file
    fw.close();
        System.out.println("File prepared Succesfully");
    }
}
