
// Q.1. Create three classes Calculator, ScCalculator and HybridCalculator and group them into a package.

// package calc;

class Calculator{
    public void calculate(int a,int b){
        System.out.println("Your Calculation is:" + a+b);
    }
}
class ScientificCalculator{
   public void calculate(int a,int b){
        // System.out.println("Your Calculation is:" + Math.sin(a+b));
               System.out.println("Your Calculation is:" + Math.sin(a+b));

    }
}

class HybridCalculator{
   public void calculate(int a,int b){
       System.out.println("Your Calculation is:" + a + b);
       System.out.println("Your Calculation is:" + Math.sin(a+b));
}
}
public class chapter12P{
    public static void main(String[] args){
   System.out.println("i am Shubham:");
    }
}