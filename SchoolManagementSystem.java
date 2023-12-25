import java.util.Arrays;
import java.util.List;

class Person {
    int Id;
    String Name;

    Person(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    int getid() {
        return Id;
    }

    String getname() {
        return Name;
    }
}

class Student extends Person {

    int grade;

    Student(int Id, String Name, int grade) {
        super(Id, Name);
        this.grade = grade;

    }

    int getGrade() {

        return grade;
    }

    void displayStudentDetail() {
        System.out.println(
                "StudentId: " + getid() + "StudnetName: " + getname() + "StudentGrade: " + getGrade());
    }
}

class Teacher extends Person {

    String dept;

    Teacher(int Id, String Name, String dept) {
        super(Id, Name);
        this.dept = dept;
    }

    String getDept() {

        return dept;
    }

    void displayTeacherDetail() {
        System.out.println(
                "TeacherId: " + getid() + "TeacherName: " + getname() + "Department: " + getDept());
    }
}

class Course {
    int cId;
    Teacher cTeacher;
    List<Student> student;
    double aveGrade;

    Course(int cId, Teacher cTeacher, List<Student> student, double aveGrade) {
        this.cId = cId;
        this.cTeacher = cTeacher;
        this.student = student;
        this.aveGrade = calculateAveGrade();
    }

    int getCoursetId() {

        return cId;
    }

    Teacher getteachner() {

        return cTeacher;
    }

    List<Student> getstudents() {

        return student;
    }

    double getavegrades() {

        return aveGrade;
    }

    double calculateAveGrade() {
        if (student.isEmpty()) {
            return 0;
        }
        int totalgrade = 0;
        for (Student student : student) {
            totalgrade += student.getGrade();
        }
        aveGrade = totalgrade / student.size();
        return totalgrade / student.size();
    }

    void displayCourseDetails() {
        System.out.println("courseid=" + getCoursetId() + "the teacher detail is ");
        cTeacher.displayTeacherDetail();
        System.out.println("the student detail is ");
        for (Student student : student) {
            student.displayStudentDetail();
        }
        System.out.println("the average grade is ");
        getavegrades();
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Student student = new Student(1683, "samuel", 10);
        Teacher teacher = new Teacher(34, "fuad", "software");
        Course course = new Course(16, teacher, Arrays.asList(student), 25);
        course.displayCourseDetails();

    }
}
