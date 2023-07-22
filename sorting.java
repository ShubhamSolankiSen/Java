import java.util.Scanner;

// bubble Sort

// sorting example of first

// public class sorting {
//     public static void printArrray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 7, 8, 3, 1, 2 };

//         // bubble sort

//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         printArrray(arr);
//     }
// }

// sorting example second

// public class sorting {
//     public static void printArrray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 5, 8, 3, 2, 6 };

//         // bubble sorting

//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {

//                     // swap

//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                 }
//             }
//         }
//         printArrray(arr);
//     }
// }

// sorting example Third

public class sorting {
    public static void printArrray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {34,56,23,11,9};

        // bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArrray(arr);
    }
}
