// public class methodOverloading {
// void tellJoke() {
// System.out.println("I invented a new word:");
// }

// public static void main(String[] args) {

// // 1.Step
// // tellJoke();

// // 2. Step
// methodOverloading obj = new methodOverloading();
// obj.tellJoke();
// }
// }
public class methodOverloading {

static void change(int[] arr) {
    arr[0] = 98;
}

// public static void main(String[] args) {
    int[] marks = { 5, 7, 9, 2, 6, 1 };
    change(marks);
    System.out.println("The value of the aray is:" + marks[0]);
}

    static void foo(){
        System.out.println("Good Morning ,Radhe Radhe.....!");
    }

    static void foo(int a){
        System.out.println("Good Morning , Jai shree krishna.....!");
    }
    public static void main(String[] args) {
        foo();
        foo(6);
    }
}

// Arguments Overloading -> one by one

// public class methodOverloading{

// static int sum(int a, int b){
// return a + b;
// }

// static int sum(int a, int b, int c){
// return a + b + c;
// }

// static int sum(int a, int b, int c,int d){
// return a + b + c + d;
// }

//     public static void main(String[] args) {
//         System.out.println(sum(5,6));
//         System.out.println(sum(5,6,8));
//         System.out.println(sum(5,6,45,3));

//     }
// }

// Arguments Overloading -> direct method call

// public class methodOverloading {

    // static int sum(int...arr){
    //     // available as int[] arr;
    //    int result = 0;
    //     for (int a : arr) {
    //       result  += a;
    //     }
    //     return result;
    // }
    // static int sum(int x,int...arr){
    //     // available as int[] arr;

    //    int result = x;
    //     for (int element : arr) {
    //       result  += element;
    //     }
    //     return result;
    // }


//     public static void main(String[] args) {
                
//         // System.out.println(sum());  -> Single arguments should be compulsory
//         System.out.println(sum(5));
//         System.out.println(sum(5, 6));
//         System.out.println(sum(5, 6, 8));
//         System.out.println(sum(5, 6, 45, 3));
//     }
// }
