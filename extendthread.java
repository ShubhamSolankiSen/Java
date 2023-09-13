class MyThread1 extends Thread{

    public void run(){
        while(true){
        System.out.println("I am watching tv:");
        System.out.println("I am very Happy:");
                // i++;
    }
}
}
class MyThread2 extends Thread{
        public void run(){
        while(true){
        System.out.println("I am fighting with her:");
        System.out.println("I am very Sad:");
                      //  i++;
    }
}
}

public class extendthread{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
       MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        // t1.run();
        // t2.run();
    }
}

// class MyThread1 extends Thread {

//   public void run() {
//     while (true) {
//       System.out.println("I am watching TV");
//       System.out.println("I am very Happy");
//       try {
//         Thread.sleep(1000); // Sleep for 1 second to avoid excessive output
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
//     }
//   }
// }

// class MyThread2 extends Thread {

//   public void run() {
//     while (true) {
//       System.out.println("I am fighting with her");
//       System.out.println("I am very Sad");
//       try {
//         Thread.sleep(1000); // Sleep for 1 second to avoid excessive output
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
//     }
//   }
// }

// public class extendthread {

//   public static void main(String[] args) {
//     MyThread1 t1 = new MyThread1();
//     MyThread2 t2 = new MyThread2();
//     t1.start();
//     t2.start();
//   }
// }
