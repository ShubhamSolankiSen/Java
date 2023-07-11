import java.util.*;

public class cond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        

        if (A == B) {
            System.out.println("Both values are equal");
        }

        else if (A > B) {
            System.out.println("A is greater than B");
        }

        else {
            System.out.println("B is greater than A");
        }
    }
}
