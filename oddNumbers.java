// Write a program to print first n Odd numbers using s for loop.

public class oddNumbers {
    public static void main(String[] args) {

        // 2n = Even numbers = 0,1,2,4,6,8
        int n = 100;
        for (int i = 1; i < 100; i++) {
            if(i%2!=0){
                System.out.println("Your Odd numbers is:" + i);
            }
    }
}
}