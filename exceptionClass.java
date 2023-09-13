import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        // return super.toString() + " i am toString() "; --> super thrown null value
        return  " i am toString() ";
    }
    @Override
    public String getMessage() {
        // return super.getMessage() + " I am getMessage() ";
        return  " I am getMessage() ";
    }
}
public class exceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        if (a < 9) {
            try {
                throw new MyException();
            
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}