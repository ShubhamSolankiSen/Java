// Q.1. What will be the output of this program ?

// Ans. is --> Three


// class A {

// }

// class B extends A {

// }

// class C extends B {

// }

// public class practice_MethodOver {
//     static void overloadedMethod(A a) {
//         System.out.println("ONE");
//     }

//     static void overloadedMethod(B b) {
//         System.out.println("Two");
//     }

//     static void overloadedMethod(C c) {
//         System.out.println("Three");
//     }

//     public static void main(String[] args) {
//         C c = new C();
//         overloadedMethod(c);
//     }
// }

// // Q.2.  in a class , one method has two overloaded forms. One form is defined as overloades forms. One form is defined as non-static and another form is defined as non-static. Is that method properly overloaded?

// class A{

//   static  public void shubh(){
//         System.out.println("I am 0 parameter method:");
//     }
//     public void shubh(int a){
//         System.out.println("I am 1 parameter method"+ a);
//     }
// }
// class B extends A{

// }
// public class practice_MethodOver{
//     public static void main(String[] args) {
//         // B b = new B(6);
//          A a = new A();
//          a.shubh(5);
        
//     }
// }



class A{
    protected void m1(){
        System.out.println("m1-A");
    }
}
class B extends A{
    public final void m1(){
        System.out.println("m1-B");
    }
}
    public class practice_MethodOver{

public static void main(String[] args) {
    B b = new B();
    b.m1();

    A a = new A();
    a.m1();
}
}