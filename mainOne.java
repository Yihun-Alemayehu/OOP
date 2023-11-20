//L2_Yishak Abraham ETS1685/14   _   Yihun Alemayehu ETS1683/14
class Student {
    int id;
    String name;
    double grade;

    Student() {
        id = 0;
        name = "Unnamed Student";
        grade = 0.0;
    }

    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    void ModifyGrade(double Modifiedgrade) {
        this.grade = Modifiedgrade;
        displayInfo();
    }

    public static double aveGrade(Student[] students) {
        double sum = 0.0;
        for (Student student : students) {
            sum += student.grade;
        }

        return sum / students.length;
    }
}

public class mainOne {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Yishak", 3.4);
        Student st2 = new Student(2, "Yihun", 2.7);
        Student st3 = new Student(3, "Yiheyis", 4.0);

        st1.displayInfo();
        st2.displayInfo();
        st3.displayInfo();

        st1.ModifyGrade(3.8);

        Student[] Students = { st1, st2, st3 };
        double averageGrade = Student.aveGrade(Students);
        System.out.println("Average Grade: " + averageGrade);
    }
}
