class A{
    public  void fun1(){
        System.out.println("hello! i am class A");
    }
}
class B extends A{
    @Override
    public  void fun1() {
        super.fun1();
        System.out.println("hii! I am clas B");
    }
}
class C extends B{
    @Override
    public  void fun1() {
        super.fun1();
        System.out.println("HII guys");
    }
}




public class test4 {
    public static void main(String[] args) {
        test4 obj =new test4();
        B obj1=new B();
        obj1.fun1();
    }
}
