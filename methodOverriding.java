class A {
    public int shubh() {
        return 1;
    }

    public void math2() {
        System.out.println("I am method 2 of class A:");
    }
}

class B extends A {
    @Override
    public void math2() {
        System.out.println("I am method 2 of class B:");
    }

    public class methodOverriding {
        public static void main(String[] args) {
            A a = new A();
            a.math2();

            B b = new B();
            b.math2();
        }
    }
}