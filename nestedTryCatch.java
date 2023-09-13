import java.util.Scanner;
public class nestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 12;
        marks[1] = 23;
        marks[2] = 66;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array ind:");
        int ind = sc.nextInt();
        try {
            // System.out.println("Welcome guys");
            try{
                System.out.println(marks[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry this index doesn't exist:");
            System.out.println("Exception in level 2:");
             }
        }
         catch (Exception e) {
        System.out.println("Exception in level 1:");
        }
    }
}
