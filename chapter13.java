// // Q.1. Write a program to print "good morning" and "welcome" continuously on the screen in java using Threads.

// class GoodMorning extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Good Morning:");
//         }
//     }
// }

// class Welcome extends Thread {
//     public void run() {

//         while (true) {
//             System.out.println("Welcome:");
//         }
//     }
// }

// public class chapter13 {
//     public static void main(String[] args) {
//         GoodMorning g1 = new GoodMorning();
//         Welcome w = new Welcome();
//         g1.start();
//         w.start();
//     }
// }

// Q.2. Add a sleep method in welcome thread of questions to dealay its
// execution for 200 ms.

class Welcome extends Thread {

public void run() {
while (true) {
try {
Thread.sleep(200);
} catch (Exception e) {
System.out.println(e);
}
System.out.println("Good Morning:");
}
}
}

class Welcome1 extends Thread {

public void run() {
while (true) {
try {
Thread.sleep(200);
} catch (Exception e) {
System.out.println(e);
}
System.out.println("Welcome:");
}
}
}

public class chapter13 {

public static void main(String[] args) {
Welcome w = new Welcome();
Welcome1 w1 = new Welcome1();
w.start();
w1.start();
}
}
