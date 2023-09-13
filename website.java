// Write a java program to find out the type of website from the url

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the website name:");
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organisation  website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is an commercial  website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an indian  website");
        }
    }
}
