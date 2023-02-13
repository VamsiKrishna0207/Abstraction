import java.util.Iterator;
import java.util.Vector;

public class VECTor {
    public static void main(String[] args) {
        Vector vec=new Vector<>();
        vec.add("Texas");
        vec.add("Zurich");
        vec.add("Delhi");
        Iterator pointer=vec.iterator();
        while(pointer.hasNext()){
            System.out.println(pointer.next());
        }
    }
}
