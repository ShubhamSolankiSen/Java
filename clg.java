// Q.1. Write a program to print numbers in words using Nested if and Switch Case.

//Q.2. Write a program called PassFail which prints "PASS" if the int variable "MArk"is more than or equal to 50; or prints "FAIL" otherwise.

// import java.util.*;
// public class clg {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the mark:");
//     int mark = sc.nextInt();
//     if (mark>=50) {
//       System.out.println("Pass");
//     } else {
//       System.out.println("Fail");
//     }
//   }
// }

//Q.3. Write a program called OddEven which prints "Odd Number"if the int variable "number" id odd , or "Even number"otherwise.

// import java.util.*;
// public class clg {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the number:");
//     int num = sc.nextInt();
//     if (num % 2 == 0) {
//       System.out.println("Even");
//     } else {
//       System.out.println("Odd");
//     }
//   }
// }

// Q.4. Write a program to find sum & average of 10 no. using arrays.

// public class clg {

//   public static void main(String[] args) {
//     int[] arr = new int [10];
//     int sum = 0;
//     for (int i = 1; i <= arr.length; i++) {
//       sum = sum + arr[i];
//     }
//     System.out.println("Sum of arrays elements are:" + sum);
//     double average = (sum / arr.length);
//     System.out.println("Average of arrays elements is:" + average);
//   }
// }

// Q.5. Write a program to display reverse of a digit no. using array.

// public class clg {

//   public static void main(String[] args) {
//     int[] arr = { 8, 2, 6, 1, 9, 3 };
//     System.out.println("Original Array:");
//     for (int i = 0; i < arr.length; i++) {
//       System.out.print(arr[i] + " " );

//     }
//     System.out.println(" ");
//     System.out.println(" Array in reverse order:");
//     for (int i = arr.length - 1; i >= 0; i--) {
//       System.out.print(arr[i] + " " );
//     }
//   }
// }

//Q.6. Write a program to display grade according to the marks obtained by the student.

// import java.util.Scanner;

// public class clg {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the number:");
//     int num = sc.nextInt();
//     if(num >= 90){
//         System.out.println("A+");
//     }
//     else if(num >=75){
//         System.out.println("A");
//     }
//     else if (num >= 60){
//         System.out.println("B");
//     }
//         else{
//             System.out.println("Rehne do Aap");
//         }
//     }
//   }

// Q.7. Find the factorial of number if number is given by user using command line argument.

// import java.util.Scanner;

// public class clg {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the factorial number:");
//     int num = sc.nextInt();
//     int fact = 1;
//     for (int i = 1; i <= num; i++) {
//       fact = fact * i;
//     }
//     System.out.println(" Factorial of " + num + " is " + fact);
//   }
// }

//Q.8. Write a program to print fibonacci series.

// public class clg {

//   public static void main(String[] args) {
//     int a = 0, b = 1, c, count = 10;
//     System.out.println(a + " " + b);
//     for (int i = 2; i < count; i++) {
//       c = a + b;
//       System.out.println(" " + c);
//       a = b;
//       b = c;
//     }
//   }
// }

// Q.9. Write a program to display table from 2.

// public class clg{
//     public static void main(String[] args) {
//         int num = 2;
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + "*" + i + " = " + num * i);
//         }
//     }
// }

// Q.10 Write a program to take an input from user and check given number is prime or not.


// Q.11. Write a program to implement method overriding.

// interface Vehicle{
//      void run();

// }
// class Bike implements Vehicle{
//     @Override
//     public void run(){
//         System.out.println("Bike is running...");
//     }
// }
// public class clg{
//     public static void main(String[] args) {
//         // Vehicle v = new Vehicle();
//         Bike b = new Bike();
//         b.run();

//     }
// }

// Q.12 Write a program to convert given string into . Uppercase and Lowercase and get the length of string using array.

// public class clg {

//   public static void main(String[] args) {
//     String name = "Shubham";
//     // uppercase
//     String str = name.toUpperCase();
//     System.out.println("Uppercase String is:" + str);
//     //lowercase
//     String str1 = name.toLowerCase();
//     System.out.println("Lowercase String is: " + str1);

//     int value = name.length();
//     System.out.println("Length of:" + value);
//   }
// }

//Q.13 Write a program to overload volume method to find out volume of cube and cuboid.

// class Shubh {
//   int a;
//   int l;
//   int b;
//   int h;

//   public int volume(int a) {
//     return a * a * a;
//   }

//   public int volume(int l, int b, int h) {
//     return l * b * h;
//   }
// }

// public class clg {

//   public static void main(String[] args) {
//     Shubh s = new Shubh();
//    System.out.println(s.volume(2));
//     System.out.println(s.volume(1, 2, 3));
//   }
// }

// Q.14. Write a program to design a class using abstract Methods and Classes.

// abstract class Shape {

//   abstract void draw();
// }

// class Circle extends Shape {

//   void draw() {
//     System.out.println("Drawing a Circle:");
//   }
// }

// public class clg {

//   public static void main(String[] args) {
//     // Shape shape = new Shape(); ---> throws an error
//     Circle c = new Circle();
//     c.draw();
//   }
// }

// Q.15. Write a program to implement multiple inheritance by using Interface.

// interface Mobile{
// void run();
// }
// interface CameraPhone{
// void Camera();
// }
// class SmartPhone extends Mobile implements CameraPhone{
// public void run(){
//     System.out.println("Mobile's Run...");
// }
// public void Camera(){
//     System.out.println("Camera click the photos:");
// }
// }

// public class clg{
//     public static void main(String[] args) {
//         SmartPhone p = new SmartPhone();
//         p.run();
//         p.Camera();
//     }
// }