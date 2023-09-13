class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(int l, int b) {
        System.out.println("Your area of Triangle is:" + 1 / 2 * l * b);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Your area of Circle is:" + 3.14 * r * r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area(4, 8);

        Circle c = new Circle();
        c.area(5);
    }
}
