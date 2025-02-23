
public class EmployeeTests {
    
    //write manual tests for the Employee class here
    
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "Doe", 1000);
        Employee e2 = new Employee(2, "Jane", "Doe", 2000);
        
        System.out.println(e1.getID()); // 1
        System.out.println(e1.getFirstname()); // John
        System.out.println(e1.getLastName()); // Doe
        System.out.println(e1.getName()); // John Doe
        System.out.println(e1.getSalary()); // 1000
        System.out.println(e1.getAnnualSalary()); // 12000
        System.out.println(e1.raiseSalary(10)); // 1100
        System.out.println(e1.toString()); // Employee[id=1,name=John Doe,salary=1100]

        System.out.println(e2.getID()); // 2
        System.out.println(e2.getFirstname()); // Jane
        System.out.println(e2.getLastName()); // Doe
        System.out.println(e2.getName()); // Jane Doe
        System.out.println(e2.getSalary()); // 2000
        System.out.println(e2.getAnnualSalary()); // 24000
        System.out.println(e2.raiseSalary(10)); // 2200
        System.out.println(e2.toString()); // Employee[id=2,name=Jane Doe,salary=2200]
        
    }
    
}
