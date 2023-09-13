// import java.util.Scanner;
// import java.util.Arrays;

// class arraypractice {
// public static void main(String[] args) {

// Q.1.Create an array of 5 floats and calculate their sum.
// float marks[] = { 2.3f, 4.5f, 6.7f, 4.4f, 13.6f };

// float sum = 0;

// // this is for each loop
// for (float element : marks) {
// sum = sum + element;
// }
// System.out.println("The valur of sum is:" + sum);

// Q.2. Write a program to find out whether a given integer is present in array
// or not.

// int[] present = { 2, 3, 4, 5, 6 };
// int num = 8;
// boolean isInArray = false;
// for (int element : present) {
// if (num == element) {
// isInArray = true;
// break;
// }
// }
// if (isInArray) {
// System.out.println("The value is present in the array:");
// } else {
// System.out.println("The value is not present in the array:");
// }

// Q.3. Calculate the average marks from an array containing marks of all
// students in physics using for each loop.

// int sum = 0;
// int average;
// int[] marks = { 89, 97, 65, 86, 77 };
// for (int element : marks) {
// sum = sum + element;

// }
// System.out.println("Calculate Averagemarks of allStudents in physics:" +
// sum/marks.length);

// Q.4. Create a java program to add two matrices of size 2 x 3 .

// This program is wrong according to question.
// int[][] matrix = new int[2][3];
// matrix[0][0] = 145;
// matrix[0][1] = 146;
// matrix[0][2] = 147;
// matrix[1][0] = 150;
// matrix[1][1] = 151;
// matrix[1][2] = 152;

// for (int i = 0; i < matrix.length; i++) {
// for (int j = 0; j < matrix[i].length; j++) {
// System.out.print(matrix[i][j]);
// System.out.print(" ");
// }
// System.out.println("");
// }

// int[][] mat1 = { { 1, 2, 3 },
// { 4, 5, 6 } };

// int[][] mat2 = { { 11, 12, 13 },
// { 14, 15, 16 } };

// int[][] result = { { 0, 0, 0 },
// { 0, 0, 0 } };

// for (int i = 0; i < mat1.length; i++) { // row numbers of times
// for (int j = 0; j < mat1[i].length; j++) { // column numbers of times
// System.out.format("Setting value for i= %d and j=%d\n", i, j);

// result[i][j] = mat1[i][j] + mat2[i][j];
// }
// }
// for (int i = 0; i < mat1.length; i++) { // row numbers of times
// for (int j = 0; j < mat1[i].length; j++) { // column numbers of times
// System.out.format("Setting value for i= %d and j=%d\n", i, j);
// System.out.println(result[i][j] + " ");
// result[i][j] = mat1[i][j] + mat2[i][j];
// }
// System.out.println("");
// }

// Q.5. Write a java program to reverse an array.

// Solve 1.

// int arr[] = { 1, 2, 3, 4, 5, 6 };
// System.out.println("Original Array:");
// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i]);
// }
// System.out.println("Print Array in reverse order:");
// for (int i = arr.length - 1; i > 0; i--) {
// System.out.println(arr[i]);
// }

// Solve 2.

// int arr[] = {1,2,3,4,5,6};
// int l = arr.length;
// int n = Math.floorDiv(1,2);
// int temp;

// for (int i = 0; i < n; i++) {
// // Swap a[i] and a[l-1-i]
// // a b temp
// // |4| |3| ||
// temp = arr[i];
// arr[i] = arr[l-1-i];
// arr[l-1-i] = temp;
// }
// for(int element: arr){
// System.out.print(element + " ");
// }

// Q.6. Write a java program to find the maximum element in an array.

// int[] arr = {4, 101, 99, 24, 56};
// int max = 0;
// for (int element : arr) {
// if (element > max) {
// max = element;
// }
// }
// System.out.println("The value of the maximum element in this array is: " +
// max);

// Q.7. Write a java program to find the minimum element in an array.

// int[] arr = {4, 101, 99, 24, 56};
// int min = 0;
// for (int element : arr) {
// if (element < min) {
// min = element;
// }
// }
// System.out.println("The value of the minimum element in this array is: " +
// min);

// int[] arr = { 4, 101, 88, 24, 56 };
// int min = arr[0];
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] < min) {
// System.out.println("Print smallest element in given array:" + min);
// }
// }

// 7. Write a program to print array is sorted or not.

// boolean isSorted = true;
// int[] arr = { 1, 2100, 3, 455, 34, 67 };
// for (int i = 0; i < arr.length-1; i++) {
// if (arr[i] > arr[i + 1]) {
// isSorted = false;
// break;
// }
// }
// if (isSorted) {
// System.out.println("This array is sorted");
// } else {
// System.out.println("This array is not sorted:");
// }

// . 8. Write a java program to sort a numeric array and a string array.

// int[] my_array1 = {45,66,3,5,9} ;
// String[] my_array2 = { "Java", "Python", "PHP", "c#", " c++" };

// System.out.println("Print Original Numeric Array:" +
// Arrays.toString(my_array1));
// Arrays.sort(my_array1);
// System.out.println("Sorted numeric Array:" + Arrays.toString(my_array1));

// System.out.println("Print Original String Array:" +
// Arrays.toString(my_array2));
// Arrays.sort(my_array2);
// System.out.println("Sorted String Array:" + Arrays.toString(my_array2));

// 9. Write a java program to sum values of an array.

// int[] my_arr = { 5, 4, 3, 28 };
// int sum = 0;
// for (int i : my_arr) {
// sum += i;
// System.out.println("The sum is:" + sum);
// }

// 10. Write a java program to print the following grid.
// public class arraypractice {
//   public static void main(String[] args) {

//     int[][] a = new int[10][10];
//     for (int i = 0; i < 10; i++) {
//       for (int j = 0; j < 10; j++) {

//         System.out.print(" - " + " ");
//       }
//       System.out.println();
//     }
//   }
// }

// 11. Write a java program to calculate the average value of an array.

// int[] my_arr = { 2, 6, 9, 7, 1 };
// // Calculate sum of all arrays.
// int sum = 0;
// for (int i = 0; i < my_arr.length; i++) {
// sum = sum + my_arr[i];
// // Calculate average value.
// double average = sum / my_arr.length;
// System.out.println("Average value of the array elements:" + average);
// }
// }
// }

// Array with functions

// 12. Write a java program to test if an array contains a specific value.

// public class arraypractice {
// public static boolean contains(int[] arr, int item) {
// // Use for - each loop
// for (int element : arr) {
// if (item == element) {
// return true;
// }
// }
// return false;
// }
// public static void main(String[] args) {
// int[] my_arr = { 5, 8, 4, 9, 11 };
// System.out.println(contains(my_arr, 11));
// }
// }

// 13. Write a java program to find the index of an array element.

// public class arraypractice {

// public static int findIndex(int[] my_arr, int t) {
// if (my_arr == null) return -1;
// int i = 0;
// int len = my_arr.length;
// while (i < len) {
// if (my_arr[i] == t) return i; else i = i + 1;
// }
// return -1;
// }

// public static void main(String[] args) {
// int[] my_arr = { 34, 67, 2, 22, 11 };
// System.out.println("Index position of 2 is:" + findIndex(my_arr, 2));
// }
// }

// 14. Write a java program to remove a specific element from an array.
// import java.util.Arrays;
// public class arraypractice {

// public static void main(String[] args){
// int[] my_arr = { 3, 7, 9, 54, 33 };

// System.out.println("Original array:" + Arrays.toString(my_arr));
// // Remove the second element(index->1 , value ->54 ) of the array
// int removeIndex = 3;
// for (int i = removeIndex; i < my_arr.length - 1; i++) {
// my_arr[i] = my_arr[i + 1];
// }
// // We cannot alter the size of an array, after the removal , the last and
// // second
// // last element in the array will exist twice.
// System.out.println("After removing the second element:" +
// Arrays.toString(my_arr));
// }
// }

// 15. Write a program to Sort Numeric Array in Ascending Order.

// import java.util.Arrays;

// class arraypractice {
// public static void main(String[] args) {
// int arr[] = { 5, 3, 2, 9, 7 };
// System.out.println("Original Array:" + Arrays.toString(arr));
// Arrays.sort(arr);
// System.out.println("Sorted Array:" + Arrays.toString(arr));
// }
// }

// 16. Write a program to Sort Numeric Array in Descending Order.\

// import java.util.Arrays;
// import java.util.Collections;

// class arraypractice {
// public static void main(String[] args) {
// int[] arr = { 23, 11, 5, 76, 87, 34, 99 };
// System.out.println("Original Array:" + Arrays.toString(arr));
// Arrays.sort(arr, Collections.reverseOrder(null));
// System.out.println("Sorted Array:" + Arrays.toString(arr));
// }
// }

// 17. Write a program to print sum values of an array

// class arraypractice {
// public static void main(String[] args) {
// int[] arr = { 3, 6, 4, 3, 6 };
// int sum = 0;
// for (int element : arr) {
// sum = sum + element;
// System.out.println(sum);
// }
// }
// }

// 18. Write a program to store elements in an array and print it.

import java.util.Arrays;

public class arraypractice {
  public static void main(String[] args) {
    int[] arr = new int[5];
    // Store elements in the array
    arr[0] = 21;
    arr[1] = 91;
    arr[2] = 41;
    arr[3] = 31;
    arr[4] = 11;
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Elements in index:" + i + ":" + arr[i]);
    }
  }
}