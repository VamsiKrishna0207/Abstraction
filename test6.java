public class test6 {//finally
    int getNextNo(int n){
        try{
            if(n==5){
                return n+1;
            }
        }
        finally {
            System.out.println("This is important code");
        }
        return n-1;
    }

    public static void main(String[] args) {
        test6 obj=new test6();
        System.out.println(obj.getNextNo(5));
    }
}
