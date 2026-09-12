class Employee {
    String empName;
    double salary;
    boolean permanent;
}

public class emp {
    public static void main(String[] args) {
        // Create one Employee object without setting any fields
        Employee emp = new Employee();
        
        // Print fields immediately to show default values
        System.out.println("Default Name: " + emp.empName);      // Outputs: null
        System.out.println("Default Salary: " + emp.salary);    // Outputs: 0.0
        System.out.println("Default Permanent: " + emp.permanent); // Outputs: false
    }
}
