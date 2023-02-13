public class test1 {
    int arg=5;
    test1(){
        System.out.println("Hi! I am a default constructor");
    }
   // void myTest(int arg){
     //   this.arg=arg;
    //}
    test1(int arg){
        this();//will call default constructor
        this.arg=arg;

    }

    public static void main(String[] args) {
        int arg=10;
        test1 obj=new test1(10);
       // obj.myTest(arg);
        System.out.println(obj.arg);
    }
}
