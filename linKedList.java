import java.util.Iterator;
import java.util.LinkedList;

public class linKedList {
    public static void main(String[] args) {
        LinkedList myll=new LinkedList();
        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");
        System.out.println(myll.get(1));
        Iterator it=myll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------");
        System.out.println("who is at the top " + myll.peek());
        System.out.println("hey first one get out " + myll.poll());
    }

}
