interface EmpDetails {
    void calculateSalary();
    void displayDetails();
}
class Manager implements EmpDetails {
    String eName="Sham";
    String eDesignation="Manager";
    int eId=101;
    double eSalary=60000.00;
    public void calculateSalary(){
        System.out.println("Salary:"+ eSalary);
    }
    public void displayDetails(){
        System.out.println("Name:"+ eName);
        System.out.println("Designation:"+ eDesignation);
        System.out.println("Id:"+ eId);
        calculateSalary();
    }
}
class Developer implements EmpDetails {
    String eName="Sagnik";
    String eDesignation="Manager";
    int eId=202;
    double eSalary=90000.00;
    public void calculateSalary(){
        System.out.println("Salary:"+ eSalary);
    }
    public void displayDetails(){
        System.out.println("Name:"+ eName);
        System.out.println("Designation:"+ eDesignation);
        System.out.println("Id:"+ eId);
        calculateSalary();
    }
}
class Employee {
    public static void main(String[] args) {
        Manager m = new Manager();
        Developer d = new Developer();
        m.displayDetails();
        d.displayDetails();
    }
    
}
