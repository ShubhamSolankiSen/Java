// Q.1.Write  a Java program to create an abstract class Animal with an abstract method called Sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the Sound() method to make a specific sound for each Animal.

// abstract class Animal {
//     abstract void sound();
// }

// class Lion extends Animal {
//     @Override
//     public void sound() {
//         System.out.println("Lion roars!....");
//     }
// }

// class Tiger extends Animal {
//     @Override
//     public void sound() {
//         System.out.println("Tiger roars!....");
//     }
// }

// public class practiceAbstract {
//     public static void main(String[] args) {

//         // Animal tiger = new Tiger();
//         // tiger.sound();
//         // Animal lion = new Lion();
//         // lion.sound();
//         Tiger  t = new Tiger();
//         t.sound();
//     }
// }

// Q.2. Write a java program to create an abstract class Shape  with Abstract methods calculateArea() and calculateperimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.

// abstract class Shape {
//     abstract double calculateArea();

//     abstract double calculatePerimeter();
// }

// class Circle extends Shape {
//     private int radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     public double calculateArea() {
//         return Math.PI * this.radius * this.radius;
//     }

//     @Override
//     public double calculatePerimeter() {
//         return 2 * Math.PI * this.radius;
//     }

// }

// class Triangle extends Shape {

//     private double side1, side2, side3;

//     public Triangle(double side1, double side2, double side3) {
//         this.side1 = side1;
//         this.side2 = side2;
//         this.side3 = side3;
//     }

//     @Override
//     public double calculateArea() {
//         double s = ((side1 + side2 + side3) / 2); // --> Semi-perimeter
//         return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//     }

//     @Override
//     public double calculatePerimeter() {
//         return side1 + side2 + side3;
//     }
// }

// public class practiceAbstract {
//     public static void main(String[] args) {
//         double r = 4.0;
//         Circle circle = new Circle(r);
//         double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
//         Triangle triangle = new Triangle(ts1, ts2, ts3);
//         System.out.println("Radius of the circle" + r);
//         System.out.println("Area of the circle" + circle.calculateArea());
//         System.out.println("Perimeter of the circle" + circle.calculatePerimeter());
//         System.out.println("Sides of the triangle are:" + ts1 + ts2 + ts3);
//         System.out.println("Area of the triangle" + triangle.calculateArea());
//         System.out.println("Perimeter of the triangle" + triangle.calculatePerimeter());
//     }
// }

// Q.3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdraws for each account type.

abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $ " + amount + " Successful.Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of $ " + amount + "Successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdraw failed.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + "successful.Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of $" + amount + "Successful.Current balance : $" + getBalance());
        } else {
            System.out.println("Insufficient Funds. Withdrawal Failed.");
        }
    }
}

public class practiceAbstract {
    public static void main(String[] args) {
        double ibal, damt, wamt;
        ibal = 1000.00;
        SavingsAccount savingsaccount = new SavingsAccount("shu001", ibal);
        System.out.println("Savings A/c: Initial Balance: $" + ibal);
        damt = 500.00;
        savingsaccount.deposit(damt);
        wamt = 250.00;
        savingsaccount.withdraw(wamt);
        wamt = 1600.00;
        System.out.println("Try to withdraw: $" + wamt);

        System.out.println();
        ibal = 5000.00;
        CurrentAccount currentaccount = new CurrentAccount("bhu001", ibal);
        System.out.println("Current A/c: Initial Balance: $" + ibal);
        damt = 2500.00;
        currentaccount.deposit(1000.00);
        wamt = 1250.00;
        currentaccount.withdraw(3000.00);
        wamt = 6000.00;
        System.out.println("Try to withdraw: $" + wamt);
        savingsaccount.withdraw(wamt);
    }
}