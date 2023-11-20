class Employee {
    String name;
    int yearOfJoining;
    String address;

    // Constructor to initialize the employee details
    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to display employee information
    void displayInfo() {
        System.out.printf("%-10s%-20d%5-20s%n", name, yearOfJoining, address);
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        // Create instances of the Employee class for three employees
        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreet");

        // Display header
        System.out.printf("%-10s%-20s%-20s%n", "Name", "Year of Joining", "Address");

        // Display information for each employee
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
