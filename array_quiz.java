import java.util.Scanner;

public class array_quiz {
    public static void main(String[] args) {

        // int size;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < size; i++) {
            if (marks[i] == x) {
                System.out.println("X found at index: " + i);
            }
        }
    }
}


    