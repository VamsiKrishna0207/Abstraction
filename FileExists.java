import java.io.File;

public class FileExists {
    public static void main(String[] args) {
        File f=new File("E:\\myTestFile.txt");
        if(f.exists()){
            System.out.println("Printing file details");
            System.out.println("__________________________");

            System.out.println("File Name : " + f.getName());
            System.out.println("File Size : " + f.length());
            System.out.println("File Path : " + f.getAbsolutePath());
            System.out.println("Is file Readable ? " + f.canRead());
            System.out.println("Is file Writable ? " + f.canWrite());
            System.out.println(" _____________________________");

        }
        //creating director in java
        File f1=new File("E:\\aveengers");
        f1.mkdir();

    }
}
