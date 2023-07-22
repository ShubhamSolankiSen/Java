// print x^n ( stack height = n ) 

// example no. 1

// public class recur {
//     public static int calcPower(int x, int n) {

//         // Base case 1
//         if (n == 0) {
//             return 1;
//         }

//         // Base case 2
//         if (x == 0) {
//             return 0;
//         }
//         int xpownm1 = calcPower(x, n - 1); // kaam
//         int xpownm2 = x * xpownm1;
//         return xpownm2;
//     }

//     public static void main(String[] args) {
//         int x = 2, n = 5;
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
// }

// Example no. 2

// public class recur {
//     public static int calcPower(int x, int n) {
     
//         // Base case 1.
//     if(n==0){
//         return 1;
//     }

//     // Base case 2.
//     if(x==0){
//         return 0;
//     }
//       int pown2 = calcPower(x, n - 1);
//         int pown = x * pown2;
//         return pown;
// }

//     public static void main(String[] args) {
//         int x = 3, n = 4;
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
// }

// print x^n (stack height = logn)


public class recur {
    public static int calcPower(int x, int n) {
     
        // Base case 1.
    if(n==0){
        return 1;
    }

    // Base case 2.
    if(x==0){
        return 0;
    }
    // if n is even
    if(n%2 == 0){
        return calcPower(x, n/2) * calcPower(x, n/2) ;
    }

else{  // if n is odd
        return calcPower(x, n/2) * calcPower(x, n/2) * x;

}
    } 
    public static void main(String[] args) {
        int x = 3, n = 4;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
