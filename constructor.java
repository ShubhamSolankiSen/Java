
class Employee {
    int id;
    String name;

    // public Employee() {
    // id = 45;
    // name = "Raju";
    // }

    public Employee(int myId, String myName) {
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}

public class constructor {
    public static void main(String[] args) {
        Employee shubh = new Employee(12, "shubham");

        // shubh.setId(23);
        // System.out.println(shubh.getId());

        // shubh.setName("Radhe-Radhe");
        // System.out.println(shubh.getName());

        // . Constructor here...
        System.out.println(shubh.getId());
        System.out.println(shubh.getName());

    }
}
