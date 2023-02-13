import java.io.File;

public class listingFiles {
    public static void main(String[] args) {
        File f=new File("E:\\ARRAYS");
        String[]files= f.list();//this will list the files we will not able to perform any task here
    for(String file:files){
        System.out.println(file);

    }
    File[]file_arr=f.listFiles();//thi will fetch the object we can modify the files
        //like file-arr
        for(File ff:file_arr){
            //ff.delete(); this will delte the files
        }
    }
}
