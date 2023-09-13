// abstract class Animal {
//     abstract void walk();
//     // public void walk(){

//     Animal() {
//         System.out.println(" You are creating a new Animal ");
//     }

//     public void eat() {
//         System.out.println("Animals eat");
//     }
// }

// class Horse extends Animal {
//     Horse() {
//         System.out.println(" Created a horse ");
//     }

//     public void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Lion extends Animal {
//     public void walk() {
//         System.out.println("Walks on 2 legs");
//     }
// }

// public class abstraction {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();

//         // Animal animal = new Animal(); //-> Throws an error
//         // animal.walk();

//         Lion lion = new Lion();
//         lion.eat();
//     }
// }

// Interface

interface Animal {
int eyes = 2;
void walk();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
public void walk() {
System.out.println("Walks on 4 legs");
}
}

public class abstraction {
public static void main(String[] args) {
Horse horse = new Horse();
horse.walk();
}
}
