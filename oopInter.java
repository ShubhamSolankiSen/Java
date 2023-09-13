// Interface is a group of related methods with empty bodies.

interface Bicycle {
  void applyBreak(int decrement);
  void speedUp(int increment);
}

class AvonCycle implements Bicycle {

  public void blowHorn() {
    System.out.println("Pee Pee Poo Poo:");
  }

  public void applyBreak(int decrement) {
    System.out.println("Applying Break:");
  }

  public void speedUp(int increment) {
    System.out.println("Applying SpeedUp:");
  }
}

public class oopInter {

  public static void main(String[] args) {
    // bicycle by = new bicycle(); --> throws an error....
    AvonCycle ac = new AvonCycle();
    ac.applyBreak(2);
    ac.speedUp(4);
    ac.blowHorn();
  }
}
