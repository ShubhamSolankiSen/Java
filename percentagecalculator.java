import java.util.*;
// public class percentage {
//     public static void main(String [] args){
//         int calculate;
//         Scanner sc = new Scanner(System.in);
 
//         int Shubham = sc.nextInt();
//         int Rahul = sc.nextInt();
//         int Raju = sc.nextInt();
//         int Vishal = sc.nextInt();
//         int Lokesh = sc.nextInt();

     

        public class percentagecalculator {

    public double calculatePercentage(double obtained, double total){
        return obtained * 100 / total;
    }

    public static void main(String[] args) {
        percentagecalculator pc = new percentagecalculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter obtained marks:");
        double obtained = in.nextDouble();
        System.out.println("Enter total marks:");
        double total = in.nextDouble();
        System.out.println("Percentage obtained: " + pc.calculatePercentage(obtained, total));
    }
}


    
