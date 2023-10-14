//Employee Management Create a class representing an employee with attributes like employee ID, name, and salary. Implement methods to calculate the yearly bonus and display employee details.
class Employee {
    String employee_ID, employee_Name;
    Double salary;
      Employee(String employee_ID, String employee_Name, Double salary){
        this.employee_ID = employee_ID;
        this.employee_Name = employee_Name;
        this.salary = salary;
      }
      void bonus(int bonus_per){
         salary= salary + (salary+bonus_per)/100;
         System.out.println("Enhanced salary: " + salary);
         System.out.println("---------------------------------");
      }
      void display(){
        System.out.println();
        System.out.println("-------------Details-------------");
        System.out.println("Employee Name: " + employee_Name);
        System.out.println("Employee ID: " + employee_ID);
        System.out.println("Employee salary: " + salary);
        
    }
    public static void main(String[] args) {
        
        Employee em1 = new Employee("G5KI8", "Sagnik",547896.00);
        Employee em2 = new Employee("ES65J", "Namm",248792.00);
        em1.display();
        em1.bonus(10);
        em2.display();
        em2.bonus(10);

    }
}
