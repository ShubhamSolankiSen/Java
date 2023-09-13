// Q.1.

class Employee {
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class oopsPractice {
    public static void main(String[] args) {

        Employee shubh = new Employee();

        shubh.setName("ShubhamSolanki");
        shubh.salary = 566;
        System.out.println(shubh.getSalary());
        System.out.println(shubh.getName());
    }
}

// Q. 2. Create a class cellphone with methods to print "ringing..." "vibrating..." etc.

// class Cellphone {

//     public void ring() {
//         System.out.println("Ringing......");
//     }

//     public void vibrate() {
//         System.out.println("Vibrating.....");

//     }

//     public void callFriend() {
//         System.out.println("Calling Mukul");
//     }
// }

// public class oopsPractice {
//     public static void main(String[] args) {
//    Cellphone vivo = new Cellphone();

//    vivo.callFriend();
//    vivo.ring();
//    vivo.vibrate();
//     }
// }

// Q.3. Create a class Square with a method to nitialize its side , Calculating area, perimeter etc.

// class Square{
//     int side;
//     public int area(){
//         return side * side;
//     }
//     public int perimeter(){
//         return 4 * side;
//     }

// }

// public class oopsPractice{
// public static void main(String[] args) {
//     Square sq = new Square();
//     sq.side = 4;
//     System.out.println(sq.area());
//     System.out.println(sq.perimeter());
// }
// }

// Q.4. Crate a class TommyVecetti for Rosckstar Games capable of hiting (print hitting), running ,firing etc.

// class TommyVecetti {

//     public void hit() {
//         System.out.println("Hitting the enemy .....");
//     }

//     public void run() {
//         System.out.println("Running from the enemy....");
//     }

//     public void fire() {
//         System.out.println("Fireing on enemy....");
//     }
// }

// public class oopsPractice {
//     public static void main(String[] args) {
//         TommyVecetti tom = new TommyVecetti();

//         tom.hit();
//         tom.run();
//         tom.fire();

//     }
// }