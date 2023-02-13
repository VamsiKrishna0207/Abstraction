class App{
    App(){
        System.out.println("Constructor of App");

    }
    App(int num){
        System.out.println(num);
    }
}

public class test2 extends App {
    test2() {
        super(29);
        System.out.println("Constructor of test2");

    }

    public static void main(String[] args) {
        new test2();
    }
}