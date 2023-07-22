import java.util.*;

public class average {
    public static int printAverage(int a, int b, int c){

        int average = (a+b+c)/2;
        return average;
    }
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
int average = printAverage(a,b,c);
        System.out.println(average);

    }
}
