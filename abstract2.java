abstract class Parent {
    public Parent() {
        System.out.println("Mai parent class ka contructor hu:");
    }

    public void say() {
        System.out.println("Hello Ankal:");
    }

    abstract void greet();

    abstract void greet2();
}

class Child extends Parent {

    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    public void greet2() {
        System.out.println("Radhe~Radhe");
    }
}

public class abstract2 {
    public static void main(String[] args) {
        // Parent p = new Parent(); -- > this is saying that mera object mt banao mujhse
        //  classes banalo par mera object mat banao .
        Child c = new Child();
        c.greet();
    }
}
