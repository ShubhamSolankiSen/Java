import java.util.*; 

public class odd_numbers{
    public static  void printNumbers(int n){
         for(int i=1; i<=n; i++){
        if(n%2==0){
            System.out.print("This is prime number:");
           
        } else{
      System.out.println("This is odd numbers:");
    }   
 
}
    }

public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

   int p =  printNumbers(n); // calling function

}
   