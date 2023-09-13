class Employee {
    private int id;
    private String name;

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

public class getSet {
    public static void main(String[] args) {
        Employee shubham = new Employee();

        // shubham.id = 12;
        // shubham.name = "ShubhamSolanki";

        // System.out.println(shubham.id);
        // System.out.println(shubham.name); --> throws an error due to private accesee
        // mopdifier

        shubham.setId(12);
        System.out.println(shubham.getId());

        shubham.setName("Shubh Sen");
        System.out.println(shubham.getName());
    }
}