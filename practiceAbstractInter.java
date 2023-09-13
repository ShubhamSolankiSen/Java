// // Create a Abstract class Pen with methods Write() and  refill() as Abstract Methods.

// abstract class Pen {

//   abstract void write();

//   abstract void refill();
// }

// class FountainPen extends Pen {

//   public void write() {
//     System.out.println("Write:");
//   }

//   public void refill() {
//     System.out.println("Refill:");
//   }
// }

// public class practiceAbstractInter {

//   public static void main(String[] args) {
//     FountainPen p = new FountainPen();
//     p.write();
//     p.refill();
//   }
// }

//Default Methods

interface MyCamera {
  void takeSnap();

  void recordVideo();
  private void greet(){
    System.out.println("Good Morning:");
  }

  // default void record4kvideo(){
  //   System.out.println("Recording... 4k video");
  // }
}

interface MyWifi {
  String[] getNetworks();

  void connectToNetwork(String network);
}

class MyCellPhone {
  void callNumber(int phoneNumber) {
    System.out.println("Calling...." + phoneNumber);
  }

  void pickCall() {
    System.out.println("Connecting...");
  }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
  public void takeSnap() {
    System.out.println("Taking Snap");
  }

  public void recordVideo() {
    System.out.println("Taking video:");
  }

  public String[] getNetworks() {
    System.out.println("Getting list of Networks:");
    String[] networkList = { "Shubh", "Raju", "Mukesh" };
    return networkList;
  }
  public void connectToNetwork(String network){
    System.out.println("Connecting to" + network);
  }
}

public class practiceAbstractInter {
  public static void main(String[] args) {
    MySmartPhone ms = new MySmartPhone();
    String[] ar = ms.getNetworks();
    for (String item: ar) {
      System.out.println(item);
    }
  }
}