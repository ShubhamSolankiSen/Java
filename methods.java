// Practice questions

// Q. 1. Write a java method to find the smallest number among three numbers.

// import java.util.Scanner;

// public class methods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Input the first number:");
//         int x = sc.nextInt();

//         System.out.println("Input the second number:");
//         int y = sc.nextInt();

//         System.out.println("Input the third number:");
//         int z = sc.nextInt();

//         System.out.println(" The Smallest Value is " + smallest(x, y, z));
//     }

//    public static int smallest(int x, int y, int z){
//     return Math.min(Math.min(x,y),z);
//     // return Math.max(Math.max(x,y),z);

//    }
// }

// Q.2. Write a Java method to Compute the average of three numbers.

// import java.util.Scanner;

// public class methods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Input the first number:");
//         int x = sc.nextInt();

//         System.out.println("Input the second number:");
//         int y = sc.nextInt();

//         System.out.println("Input the third number:");
//         int z = sc.nextInt();

//         System.out.println(" The Average of three numbers is " + average(x, y, z));
//     }

//    public static int average (int x, int y, int z){
//     return  (x+y+z)/3;

//    }
// }

// Q.3. Write a Java method to display the middle character of a string.
// (Note:a) if the length of the String is odd there will be two middle Characters.
//b)If the length of the String is even there will be one middle characters.

// import java.util.Scanner;

// public class methods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input a String:");

//         String str = sc.nextLine();
//         System.out.println("The middle character in the String:" + middle(str));
//     }

//     public static String middle(String str) {
//         int position;
//         int length;
//         if (str.length() % 2 == 0) {
//            position = str.length() / 2 - 1;
//            length = 2;
//         }
//         else{
//             position = str.length() / 2 ;
//            length = 1;
//         }
//         return str.substring(position,position+length);
//     }
// }

// Q.4 Write a java method to count all vowels in a string

// import java.util.Scanner;

// public class methods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input the String:");
//         String str = sc.nextLine();
//         System.out.println("Number of vowels in the string:" + count_vowels(str));
//     }

//     public static int count_vowels(String str)
//     {
//         int count = 0;
//         for (int i = 0; i < str.length(); i++)
//          {
//             if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
//             {
//                 count++;
//             }
//         }
//         return count;
//     }
// }

// Q.5. Write a java method to count al the words in a string.

// import java.util.Scanner;
// public class methods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String:");
//         String str = sc.nextLine();
//         System.out.println("Numbers of words in the String:" + count_words(str));
//     }

// public static count_words(String str){
// int count = 0;
// if(!(" ".equals(str.substring(0,1))) || !(" ".equals(str.subString(str.length()-1))))
// {
//     for( int i = 0; i < str.length(); i++)
//     {
//         if(str.charAt(i)== ' ')
//         {
//             count++;
//         }
//     }
//     count = count + 1;
// }
// return count;  // return 0 if string starts or ends with space " ".
// }
// }

// Q.6. Write a java method to compute the sum of digits in an integer.

// import java.util.Scanner;

// public class methods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input an integer:");
//         int digits = sc.nextInt();
//         System.out.println("The sum is:" + sumDigits(digits));
//     }

//     public static int sumDigits(int n) {
//         int result = 0;
//         while (n > 0) {
//             result += n % 10;
//             n /= 10;
//         }
//         return result;
//     }
// }

// Q.7. Write a Java method to check whether a string is a valid password.
// Rules:
// 1.A password must have at least ten characters.
// 2. A password consists of only letters and digits.
// 3. A password must contain at least two digits.

// import java.util.Scanner;

// public class methods {

// public static final int PASSWORD_LENGTH = 8;

// public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.print(
//                 "1. A password must have at least eight characters.\n" +
//                 "2. A password consists of only letters and digits.\n" +
//                 "3. A password must contain at least two digits \n" +
//                 "Input a password (You are agreeing to the above Terms and Conditions.): ");
//         String s = input.nextLine();

//         if (is_Valid_Password(s)) {
//             System.out.println("Password is valid: " + s);
//         } else {
//             System.out.println("Not a valid password: " + s);
//         }

//     }

//     public static boolean is_Valid_Password(String password) {

//         if (password.length() < PASSWORD_LENGTH) return false;

//         int charCount = 0;
//         int numCount = 0;
//         for (int i = 0; i < password.length(); i++) {

//             char ch = password.charAt(i);

//             if (is_Numeric(ch)) numCount++;
//             else if (is_Letter(ch)) charCount++;
//             else return false;
//         }

//         return (charCount >= 2 && numCount >= 2);
//     }

//     public static boolean is_Letter(char ch) {
//         ch = Character.toUpperCase(ch);
//         return (ch >= 'A' && ch <= 'Z');
//     }

//     public static boolean is_Numeric(char ch) {

//         return (ch >= '0' && ch <= '9');
//     }

// }

// Q.8.  Write a program to print the sum of two numbers entered by user by defining your own method.

// import java.util.Scanner;

// public class methods {
//     public static void Sum(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a:");
//         int a = sc.nextInt();

//         System.out.println("Enter b:");
//         int b = sc.nextInt();

//        System.out.println("Sum is: " + (a+b));
//     }

//     public static void main(String[] args) {
//         Sum();
//     }
// }

// Q.9. Write a program to print the factorial  of a number by defining a method named "Factorial".

// import java.util.Scanner;

// public class methods {
//     public static int factorial(int x){
//         if((x==0) || (x==1)){
//             return 1;
//         }
//         else{
//             return factorial(x-1)*x;
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }

