// Q.1. Create a class Circle and use inheritance to create another class Cylinder from it.

// class Circle {
//     public int radius;

//     Circle(int r) {
//         System.out.println("I am Circle class parameterised Constructor:");
//         this.radius = r;
//     }

//     public double area() {
//         return Math.PI * this.radius * this.radius;
//     }
// }

// class Cylinder extends Circle {
//     public int height;

//     Cylinder(int h, int r) {
//         super(r);
//         System.out.println("I am Cylinder class parmeterised Constructor:");
//         this.height = h;
//     }

//     public double volume() {
//         return Math.PI * this.radius * this.radius * this.height;
//     }
// }

// public class practiceInheritance {
//     public static void main(String[] args) {
//         Circle c = new Circle(5);
//         Cylinder cy = new Cylinder(7, 8);
//     }
// }

// Q.2. Create a class Rectangle and use inheritance  to create another class cuboid. Try to keep it as close to real world  Scenario as possible.

class Rectangle {
    int length, width;

    Rectangle(int l,int w) {
        this.length = l;
        this.width = w;
    }

    public int getRectangle() {
        return length * width;
    }
}

class Cuboid extends Rectangle {
    int breadth, height, length;

    Cuboid(int l, int b, int h) {
        super(l,w);
        this.breadth = b;
        this.height = h;
        this.length = l;
        System.out.println("This is Area of Cuboid: ");
    }

    public int getCuboid() {
        return this.length * this.breadth * this.height;
    }
}

public class practiceInheritance {
    public static void main(String[] args) {
        Cuboid cu = new Cuboid(4, 5, 6);
        // cu.getCuboid();
        Rectangle r = new Rectangle(2, 3);
        // r.getRectangle();
    }
}

// class Shape {
// public void area() {
// System.out.println("Display Area");
// }
// }

// class Triangle extends Shape {
// public void area(int l, int b) {
// System.out.println("Your area of Triangle is:" + 1 / 2 * l * b);
// }
// }

// class Circle extends Shape {
// public void area(int r) {
// System.out.println("Your area of Circle is:" + 3.14 * r * r);
// }
// }

// public class practiceInheritance {
// public static void main(String[] args) {
// Triangle t = new Triangle();
// t.area(4, 8);

// Circle c = new Circle();
// c.area(5);
// }
// }
