class Employee{
    String name, designation;
    int id, salary;

    Employee(){
        this.name = "Rahul";
        this.designation = "Unknown";
        this.id = 5565;
        this.salary = 66663;
    }
    Employee(String name, String designation, int id, int salary){
        this.name = name;
        this.designation = designation;
        this.id = id;
        this.salary = salary;
    }
   void display(){
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee em1 = new Employee();
        Employee em2 = new Employee("Sagnik", "Freshers", 4562, 50000);
        em1.display();
        em2.display();
    
    }
}