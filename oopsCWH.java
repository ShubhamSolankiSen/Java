class Employee {
    // i have creating a custom class

    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My ID is:" + id);
        System.out.println(" and My Name is:" + name);
    }
    public int printSalary(){
        return salary;
    }
}

public class oopsCWH {
    public static void main(String[] args) {
        System.out.println("This is our custom class:");
        Employee harry = new Employee();
        Employee shubh = new Employee();

        harry.id = 1;
        harry.salary = 45;
        harry.name = "Shubham";

        // System.out.println(harry.id);
        //  System.out.println(harry.name);
        
        shubh.id = 2;
        shubh.name = "harry";
        shubh.salary = 56;
         

        harry .printDetails();
        shubh .printDetails();

        int salary = shubh.printSalary();
        System.out.println(salary);

       
    }
}
