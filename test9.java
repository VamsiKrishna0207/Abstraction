import java.util.ArrayList;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String>list=new ArrayList<>();
        for(int i=1;i<=5;i++){
            String item =sc.next();
            if(list.contains(item)){
                continue;
            }
            else{
                list.add(item);
            }
        }
        System.out.println(list);
    }
}
