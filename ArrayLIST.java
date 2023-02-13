import java .util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class ArrayLIST {
    public static void main(String[] args) {
        ArrayList<String>states=new ArrayList<>();
        states.add("clafornia");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");
        System.out.println("ArrayList: "+ states);
        String s=states.get(2);
        System.out.println("I got " +s);
       // for(int i=0;i<states.size();i++){
          //  System.out.println(states.get(i));
        //update
        states.set(2,"Texas");
        System.out.println("After Updation:  " + states);
        //sorting
        states.sort(Comparator.naturalOrder());//A-Z
        System.out.println("ArrayList aster sorting" + states);
    //contains()Method
        System.out.println("Is newyork there ? " +states.contains("newyork"));
    //get Index of element using indexOf
        System.out.println("Texas is at " + states.indexOf("Texas") + " index");
    //to check list is empty or not
        System.out.println("Is list Empty ? "+ states.isEmpty());
        states.removeAll(states);
        System.out.println("Is list Empty ? " + states.isEmpty());


    }
    }

