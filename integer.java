// Take 10 integers from keyboard using loop and print their average value on the scren.

import java.util.Scanner;
public class integer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            
            sum = sum + x;
        }
            System.out.println("Sum is:" + sum);
        }
    }
    

