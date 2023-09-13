// Thread from Constructor

class MyThr extends Thread {

       MyThr(String name) {
    super(name);
  }

  public void run() {
  int i = 34;
    System.out.println("Thank You");
    // while (true) {
    //   System.out.println("I am Running:");
    // }
  }
}

public class threadCon {

  public static void main(String[] args) {
    MyThr mt = new MyThr("Shubham");
    mt.start();
    System.out.println("The id of the Thread is:"+ mt.getId());
    System.out.println("The id of the Thread is:"+ mt.getName());
  }
}

// Java Thread Priorities

// class MyThr extends Thread {

//   MyThr(String name) {
//     super(name);
//   }

//   public void run() {
//     System.out.println("Thank You " + this.getName());
//   }
// }

// public class threadCon {
//   public static void main(String[] args) {
//     MyThr mt1 = new MyThr("Shubham1");
//     MyThr mt2 = new MyThr("Shubham2");
//     MyThr mt3 = new MyThr("Shubham3");
//     MyThr mt4 = new MyThr("Shubham4");
//     MyThr mt5 = new MyThr("Shubham5");

//     mt5.setPriority(Thread.MAX_PRIORITY);
//     mt2.setPriority(Thread.MIN_PRIORITY);
//     mt4.setPriority(Thread.NORM_PRIORITY);
//     mt1.start();
//     mt2.start();
//     mt3.start();
//     mt4.start();
//     mt5.start();
//   }
// }
