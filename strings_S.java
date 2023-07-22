import java.util.Scanner;

//   StringBuilders

public class strings_S {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shubham");
        // System.out.println(sb);

        // charAt index 0

        // System.out.println(sb.charAt(0));

        // Set charAt index 0

        // sb.setcharAt(0,"d");
        // System.out.println(sb);

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 => 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
