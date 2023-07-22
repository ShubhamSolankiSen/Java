import java.util.Scanner;


//  concepts of strings


public class strings {
        public static void main(String[] args) {
                // Scanner sc = new Scanner(System.in);
                // String name = sc.nextLine();
                // String fullName ="shubham solanki";
                // String sentence = " My name is shubham solanki";
                // System.out.println("Your name is: " + fullName);

                // System.out.println("Your name is: " + name);

                // // Concatenation

                // String firstName = "Shubham";
                // String lastName = "Solanki";
                // String fullName = firstName + " " + lastName;
                // // System.out.println(fullName.length());

                // // charAt

                // for (int i = 0; i < fullName.length(); i++) {
                //         System.out.println(fullName.charAt(i));
                // }

                // Compare

                // String name1 = "Shubham"; 
                // String name2 = "Shubham"; 

// 1. s1 > s2 : return positive value
// 2. s1 == s2 return 0 value
// 3. s1 < s2 return negative value;

// if(name1.compareTo(name2)==0){
//          System.out.println("Both are equal:");
// } else{
//         System.out.println("Both are not equal:");
// }


                
                // if(name1 == name2) {
                //         System.out.println("Both are equal:");
                // }
                //         else{
                //                 System.out.println("Both are not equal");
                //         }

                String sentence = "My name is Shubham Solanki";
             
               String name = sentence.substring(19,sentence.length());
                System.out.println(name);
                }
 
        }
