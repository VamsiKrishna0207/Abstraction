import java.util.InputMismatchException;
import java.util.Scanner;
public class test5 {
    int n1,n2,result;
    Scanner sc=new Scanner(System.in);
    void calculate() {
        System.out.println("Enter first number");

        try {
            int n1 = sc.nextInt();
            System.out.println("Enter second number");
            int n2 = sc.nextInt();
            result = n1 / n2;
        }
        catch(InputMismatchException ime){
            System.out.println("IME DETECTED");
        }
        catch(ArithmeticException ae){
            System.out.println("AE Detected");
        }
        catch (Exception e){
            System.out.println("error occured");
        }
finally{
            System.out.println("The division is " + result);
        }
    }

    public static void main(String[] args) {
        test5 obj=new test5();
        obj.calculate();
    }
}
