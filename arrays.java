import java.util.Scanner;

public class arrays {
    public  static void main(String [] args){

        // There are two types of enter arrays

        // int [] marks = new int[3];
        // // int marks [] = {96,92,99};

        // marks[0] = 96; //English
        // marks[1] = 92; //physics
        // marks[2] = 99; //Chemistry
        
        // Direct

        // System.out.println("Your obtained marks in English is : " +  marks[0]);
        // System.out.println("Your obtained marks in Physics is : " + marks[1]);
        // System.out.println("Your obtained marks in Chemistry is : " + marks[2]);
             
        // use for loop

    //     for(int i=0; i<3; i++){
    //         System.out.println(marks[i]);
    //     }
             
    //  use while loop
  
        //      int i=0;
        //   while(i<3){
          
        //           System.out.println(marks[i]);
        //           i++;
        //   }
                //    use do-while loop
                
    //             int i=0;
    //             do{
    //                 System.out.println(marks[i]);
    //                 i++;
    //             }
    //             while(i<3);
    // } 
    
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    
    int numbers[] = new int[size]; 
    
    // input

    for (int i = 0; i < size; i++) {
        numbers[i] = sc.nextInt();
    }
        
    //    output

    for (int i = 0; i < size; i++) {
        System.out.println(numbers[i]);   
    }
    }
}
