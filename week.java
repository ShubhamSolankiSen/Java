// Write a Java program to find out the day of the week given the number [1 for monday, 2 for Tuesday... and So on!]

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int day = sc.nextInt();
  
        switch (day) {
            // System.out.println("Enter the number of days:");

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Thursday");
            case 4 -> System.out.println("Friday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }
    }
}
