// public class ipatterns {

//     // patterns practice
//     public static void main(String[] args) {
//         int n = 5;

        // print the pattern
        // *
        // **
        // ***
        // ****
        // *****

        // // outer loop
        // for (int i = 1; i <= n; i++) {

        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // print the pattern
        // *****
        // ****
        // ***
        // **
        // *

        // outer loop
        // for (int i = n; i >= 1; i--) {

        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // print the pattern
        // *
        // **
        // ***
        // ****
        // *****
        // outer loop
        // for (int i=1; i<=n; i++) {

        // // print the spaces
        // for (int j=1; j<=n-i ; j++) {
        // System.out.print(" ");
        // }

        // // print the stars
        // for (int j=1; j<=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // print this pattern

        // *****
        // // ****
        // ***
        // **
        // *
        // outer loop
        // for (int i=n; i>=1; i--) {

        // // print the spaces
        // for (int j=1; j<=n-i ; j--) {
        // System.out.print(" ");
        // }

        // // print the stars
        // for (int j=1; j<=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // }
        // }

        // print the pattern

        // half part
        
//  outer loop
//          for (int i=1; i<=n; i++) {

//          // print the spaces
//          for (int j=1; j<=n-i ; j++) {
//         System.out.print(" ");
//          }

//          // print the stars
//          for (int j=1; j<=i; j++) {
//          System.out.print("*");
//          }
//         //  System.out.println();
         

//         //  next half part
//         // outer loop
//     for (int j = 1; i <= n; i++) {

//         // inner loop
//         for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//         }
//         System.out.println();
//         }
//     }
// }
// }

// print butterfly

// public class ipatterns{
//     public static void main(String[] args){
//         int n = 5;

// // half part (outer loop)
//         for (int i = 1; i <= n; i++) {
// // inner loop

// // print stars
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }

//     // print spaces
//     int spaces = 2*(n-i);
//     for (int j = 1; j <= spaces; j++) {
//         System.out.print(" ");
//     }

//     // print second part stars
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }
//     System.out.println();            
//         }
    
//          // outer loop & second part half
//         for (int i = n; i >= 1; i--) {
// // inner loop

// // print stars
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }

//     // print spaces
//     int spaces = 2*(n-i);
//     for (int j = 1; j <= spaces; j++) {
//         System.out.print(" ");
//     }

//         // print second part stars
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
//         }
//     }
// }

// print pyramid stars

// public class ipatterns{
//     public static void main(String[] args){
//         int n = 5;
 
//         // Left side
//         // outer loop 
//         for (int i = 1; i <= n; i++) {
               
//            // Spaces
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }

//             // Stars
//                for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
           
//         // Right side
// // outer loop 
//         for (int i = 1; i <= n; i++) {
               
//         //    // Spaces
//         //     for (int j = 1; j <= n-i; j++) {
//         //         System.out.print(" ");
//         //     }

//             // Stars
//                for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

// public class ipatterns{
//     public static void main(String[] args){
//         int n = 5;
//         for (int i = 1; i <= n; i++) {

//       // spacesPrint
//             for(int j = 1; j <= n-i; j++){
//     System.out.print(" ");
//             }

// //  starsPrint
//   for(int j = 1; j <= n; j++){
//        System.out.print("*");
//   }
//   System.out.println();
//         }
//     }
// }

// print number pyramid

// public class ipatterns{
//     public static void main(String[] args){
//         int n = 5;
//         for (int i = 1; i <= n; i++) {

//             // spacesPrint
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }

//             // print row numbers
//             for (int j = 1; j <= i ; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// palindromic pattern

public class ipatterns{
    public static void main(String [] args){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
             for (int j = 1; j >= 1; j--) {
                System.out.print(j);
             }
             for (int j = 1; j <= i ; j++) {
            System.out.print(j);
        }
            System.out.println();
        }
    }
}