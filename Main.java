
class Employee {
    String name;
    int joinYear;
    double salary;
    String address;

    Employee(String name, int joinYear, double salary, String address) {
        this.name = name;
        this.joinYear = joinYear;
        this.salary = salary;
        this.address = address;
    }

    void printInfo() {
        System.out.printf(name, joinYear, address);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 0, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, 0, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, 0, "626B- WallsStreet");

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
    }
}
