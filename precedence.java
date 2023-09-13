
import java.util.Scanner;
public class precedence {
    public static void main(String[] args) {
        // // BODMAS rule is not run in java
        // // Java follows of precedence and associativity

        // int a = 6 * 5 - 34 / 2;

        // // Precedence
        // /*
        //  * = 30 - 34/2
        //  * = 30 - 17
        //  * = 13
        //  */
        // int b = 60 / 5 - 34 * 2;

        // // Associativity
        // /*
        //  * Associativity is go to left to right
        //  * = 12 - 34 * 2
        //  * = 12 - 68
        //  * = - 56
        //  * 
        //  */

        // System.out.println(a);
        // System.out.println(b);

        // Quick quiz
 // 1.
        // int x = 6;
        // int y = 1;
        // int k = x*y/2;
        // System.out.println(k);
  // 2.
//   int a = 5;
//   int b = 1;
//   int  c = 4;
//   int k = b*b - (4*a*c)/(2*a);  // according to precedence
//   System.out.println(k);

// 3
// What will be the result of the following expression float a = 7/4 * 9 / 2 .
    
    // float a = 7/4 * 9/2;
    // System.out.println(a);
    // it's wrong

    // float a = 7/4.0f * 9/2.0f;
    // System.out.println(a);
    // it's right

//4.
// Write a java program to encrypt a grade by adding 8 to it.Decrypt it to show the correct grade

    // Encrypting the grade 

// char grade = 'B';
// grade = (char) (grade + 8);
// System.out.println(grade);

    // Decrypting the grade 
//     char grade = 'B';
// grade = (char) (grade - 8);
// System.out.println(grade);


// 4. Use comparison operators to find out whether a given number number id greater than the user entered number or not.

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int a = sc.nextInt();
//    System.out.println(a>8);

// 5. Write the following expression in a java program

// int v = 3;
// int u = 2;
// int a = 1;
// int s = 2;
// System.out.println((v*v-u*u)/(2*a*s));


    }
}