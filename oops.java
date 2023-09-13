// class pen {

//     String color;
//     String type; // ballpoint ; gel

//     public void write() {
//         System.out.println("writing something");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }
//     public void printType(){
//         System.out.println(this.type);
//     }
// }

class Student{
String name;
int age;

// non-parameterised constructor
// Student (){
//     System.out.println("constructor called:");
// }



public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}

// parameterised constructor

Student(String name, int age){
    this.name = name;
    this.age = age;
}

// copy constructor
Student(Student s2){
      this.name = s2.name;
    this.age = s2.age;
}
}

public class oops {
    public static void main(String[] args) {
        // pen pen1 = new pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen1.write();

        // pen pen2 = new pen();
        // pen2.color = "black";
        // pen2.type = "ballpen";

        // pen1.printColor();
        // pen2.printColor();
        
        // Student s1 = new Student();
        // s1.name = "Shubham";
        // s1.age = 21;

        
        Student s1 = new Student("shubham",21);
        // s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();

    }
}
