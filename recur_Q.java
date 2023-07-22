import java.util.*;
// Q.1. Place Tiles of size 1xm in a floor of size nxm
// n = 4, m = 2

// public class recur_Q {
//     public static int placeTiles(int n, int m) {
//         if (n == m) {
//             return 2;
//         }
//         if (n < m) {
//             return 1;
//         }

//         // vertically
//         int vertPlacements = placeTiles(n - m, m);

//         // horizontally
//         int horPlacements = placeTiles(n - 1, m);
//         return vertPlacements + horPlacements;
//     }

//     public static void main(String[] args) {
//         int n = 4, m = 2;
//         int totalplacetiles = placeTiles(n, m);
//         System.out.println(totalplacetiles);

//     }
// }

// Q.2. countpaths

// public class recur_Q {

//     public static int countPaths(int i, int j, int n, int m) {

//         // Base case
//         if (i == n || j == m) {
//             return 0;
//         }
//         if (i == n - 1 && j == m - 1) {
//             return 1;
//         }
//         // downwards
//         int downpaths = countPaths(i + 1, j, n, m);

//         // rightwards
//         int rightpaths = countPaths(i, j + 1, n, m);
//         return downpaths + rightpaths;

//     }

//     public static void main(String[] args){
//         int n = 3, m = 3;
//         int totalpaths = countPaths(0, 0, n, m);
//         System.out.println(totalpaths);
//     }
// }

// Q.3. find the number of ways in which you can invite n people to your party,single or in pairs.   n == 4

// 

// Print all the subsets of a set of first n natural numbers , n=3

public class recur_Q {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
        }
        // add hoga
        subset.add(n);
        findSubsets(n - 1, subset);

        // add nahi hoga
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
