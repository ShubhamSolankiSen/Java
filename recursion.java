// Print numbers from 5 to 1

// withiut recursion

// public class recursion{
//     public static void main(String[] args){
//         for (int i = 5; i > 0; i--) {
//             System.out.println(i);
//         }
//         // System.out.println();
//     }
// }

// public class recursion{
//     public static void printNumber(int n){

//         // Base Case

//         if(n==0)
//         return ;

//         // Recursion

//         System.out.println(n);
//         printNumber(n-1);
//     }

// public static void main(String[] args){
//     int n = 5;
//     printNumber(n);
// }
// }

// print numbers from 1 to 5

// public class recursion{
//     public static void printNumber(int n){

//         // Base case

//       if(n==6){
//       return;
//       }

//     //   Recursion

//     System.out.println(n);
//     printNumber(n+1);

//     }
//     public static void main(String [] args){
// int n = 1;
// printNumber(n);  // n = 1
//     }
// }

// print natural number  of sum 
// example no. 1

// public class recursion{
//     public static void printSum(int i,int n, int sum){

//         // Base case
//         if(i == n){
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }
//  sum +=i;
//  printSum(i+1, n, sum);
//  System.out.println(i); // print value of i

//     }
//     public static void main(String [] args){
// printSum(1, 6, 0);
//     }
// }

// example of 2.
// public class recursion{
//     public static void printSum(int i , int n, int sum){
//      // base case
//        if(i==n){
//         sum+=i;
//         System.out.println(sum);
//         return ;
//        }
//      sum+=i;
//      printSum( i + 1, n, sum);
//     }
//     public static void main(String [] args){
//     int n = 6;
//     printSum(1, 5, 0);
//     }
// }

// print factorial number
// example no.1

// public class recursion{
//     public static int printFactorial(int n){

//         // Base case
//         if(n==1 ||n==0){
//             return 1;
//         }
//         int fact_nm1 = printFactorial(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//     }
//     public static void main(String [] args){
//    int n = 5;
//     int ans = printFactorial(n);
//    System.out.println(ans);
//     } 
// }

// // example no.2

// public class recursion {
//     public static int printFactorial(int n) {

//         // Base case

//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         printFactorial(n - 1);
//         int calc = n * printFactorial(n - 1);
//         return calc;

//     }

//     public static void main(String[] args) {
//         int n = 4;
//         printFactorial(n);
//         System.out.println(printFactorial(n));
//     }
// }

// print the Fibonacci series

// Example no. 1

// public class recursion {
//     public static void printFib(int a, int b, int n) {
//         // Base case
//         if (n == 0) {
//             return;
//         }
//         int c = a + b;
//         System.out.println(c);
//         printFib(b, c, n - 1);
//     }

//     public static void main(String[] args) {
//         int a = 0;
//         int b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 6;
//         printFib(a, b, n - 2);
//     }
// }

// Examople no. 2

// public class recursion{
//     public static void printFib(int a , int b , int n){
//         if(n==0){
//             return;
//         }
//               int c = a + b;
//                 System.out.println(c);
//                 printFib(b, c, n-1);
//     }

//         public static void main(String[] args){
//             int a = 0;
//             int b = 1;
//             System.out.println(a);
//             System.out.println(b);
//             int n = 9;
//             printFib(a,b,n-2);
//         }

// }

// print factorial from iteration method

// public class recursion {
//     public static void main(String[] args) {
//         int n = 5;
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//                fact = fact*i;
//         }
//         System.out.println(fact);
//     }
// }

// print fibonacci seRies form iteration method

// public class recursion {
//     public static void main(String[] args) {
//         int n = 7;
//         int a = 0;
//         int b = 1;
//         System.out.println(a + " " + b);
//         for (int i = 2; i < n; i++) {
//             int c = a + b;
//             System.out.println(" "+c);
//             a = b;
//             b = c;
//         }
//     }
// }


