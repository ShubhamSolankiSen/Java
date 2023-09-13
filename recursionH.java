// public class recursionH {

// 1. Print factorial of given number.

// First method

// factorial = n * n-1........1
// Factorial(n) = n * factorial(n-1);

// static int factorial(int n){
// if(n==0 || n==1){
// return 1;
// } else {
// return n * factorial(n-1);
// }
// }
// public static void main(String[]args){
// int n = 5;
// System.out.println(factorial(n));
// }

// public static int printFac(int n){
//       if(n==0 || n==1){
//         return 1;
//       }
//    int fac = printFac(n-1);
// return n* fac;
// }
// public static void main(String[] args) {
//     int n = 4;
//     int ans = printFac(n);
//     System.out.println(ans);
// }
// }

// 2. Print Fibonacci Series.

// First method

// Formula = F(n) = F(n-1) + F(n-2)
// Here, F(n) represents the nth Fibonacci Series

//     static int printFibonacci(int n) {
//         // Base case

//         if (n <= 1)
//             return n;

//         // Recursive call
//         return printFibonacci(n - 1) + printFibonacci(n - 2);

//     }

//     // Driver code
//     public static void main(String[] args) {
//         int n = 4;

//         // Print the first n numbers:
//         for (int i = 0; i < n; i++) {

//             System.out.println("Your Fibonacci Series is: " + printFibonacci(i) + " ");
//         }
//     }
// }

// Second Method

// public class recursionH {
//   public static void printfib(int a, int b, int n) {
//         // Base Case
//         if (n == 0) {
//             return;
//         }
//         int c = a + b;
//         System.out.println(c);
//         printfib(b, c, n - 1);
//     }

//     public static void main(String[] args) {
//         int a = 0;
//         int b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         printfib(a,b,n-2);

//     }
// }

// Third method

public class recursionH {

    public static int fib(int n) {
        // Base case
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);
    }
}