import java.util.*;

public class HasHset {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("orange");
        hs.add("red");
        hs.add("red");
        hs.add("green");//it doesnot has a order
        System.out.println(hs);
        //Linked hashset has a order
        LinkedHashSet lh=new LinkedHashSet();
        lh.add("yellow");
        lh.add("greeen");
        lh.add("white");
        lh.add("yellow");
        lh.add("red");
        System.out.println(lh);
//Treeset ->it does not allow nulls
        //->it sorts in ascending order
        TreeSet ts=new TreeSet();
        ts.add("Blue");
        ts.add("green");
        ts.add("red");
        //ts.add(null);
        System.out.println(ts);
    }
}
