// Q.1. Write a java program to demonstrate syntax,logical & runtime errors.

// public class practiceSet14 {
//     public static void main(String[] args) {

//         // Syntax error
//  int a = 7

// //  Logical Error

// int age = 28;
//          int year_born = 2000-28; 

//         //  Exception

//     int a = 4;
//     int b = 0;
//     int c = a/b;

//     }
// }

// Q.2. Write  a java program that prints "Haha" during Arithmetic exception and "Hihi" during illegal argument exception.

// public class practiceSet14 {
//     public static void main(String[] args) {
//         try {
//             int a = 55 / 0;
//         } catch (IllegalArgumentException e) {
//             System.out.println("Hihi");
//         } catch (ArithmeticException e) {
//             System.out.println("Haha");
//         }
//     }
// }

// Q.3. Write a java program that allows you to keep accessing an array until a valid index is given.If max retries exceed 5 print "Error".

import java.util.Scanner;
public class practiceSet14 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 23;
        marks[1] = 46;
        marks[2] = 88;

        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.println("Enter the number of index:");
                int index = sc.nextInt();
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index:");
                i++;
            }
        }
        if (i >= 5) {
            System.out.println("Error:");
        }
    }
}