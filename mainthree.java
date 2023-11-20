//L2_Yishak Abraham ETS1685/14   _   Yihun Alemayehu ETS1683/14

import java.util.ArrayList;

class Course {
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private ArrayList<Student> enrolledStudents;

    Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    void enrollStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            System.out.println("Student " + student.getStudentName() + " enrolled in course " + courseName);
        } else {
            System.out.println("Course " + courseName + " is at maximum capacity. Cannot enroll more students.");
        }
    }

    void displayEnrolledStudents() {
        System.out.println("Enrolled Students in Course " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("  " + student.getStudentName() + " (ID: " + student.getStudentID() + ")");
        }
        System.out.println();
    }

    String getCourseName() {
        return courseName;
    }

    String getCourseCode() {
        return courseCode;
    }
}

class Student {
    private int studentID;
    private String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }
}

class School {
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public School() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course " + course.getCourseName() + " added to the school.");
    }

    void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getStudentName() + " added to the school.");
    }

    void enrollStudentInCourse(Student student, Course course) {
        if (students.contains(student) && courses.contains(course)) {
            course.enrollStudent(student);
        } else {
            System.out.println("Student or Course not found. Cannot enroll.");
        }
    }

    void displaySchoolInfo() {
        System.out.println("Courses in the School:");
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName() + " (Code: " + course.getCourseCode() + ")");
            course.displayEnrolledStudents();
        }

        System.out.println("Students in the School:");
        for (Student student : students) {
            System.out.println("Student: " + student.getStudentName() + " (ID: " + student.getStudentID() + ")");
        }
    }
}

public class mainthree {
    public static void main(String[] args) {
        // Instantiate the School class
        School school = new School();
        Course mathCourse = new Course("MATH101", "Maths", 30);
        Course physicsCourse = new Course("PHYS101", "Phy", 25);
        school.addCourse(mathCourse);
        school.addCourse(physicsCourse);

        Student yishak = new Student(1, "yishak");
        Student yihun = new Student(2, "yihun");
        Student yehyis = new Student(3, "yehyes");
        school.addStudent(yishak);
        school.addStudent(yihun);
        school.addStudent(yehyis);

        school.enrollStudentInCourse(yishak, mathCourse);
        school.enrollStudentInCourse(yihun, mathCourse);
        school.enrollStudentInCourse(yehyis, physicsCourse);
        school.enrollStudentInCourse(yishak, physicsCourse);

        school.displaySchoolInfo();
    }
}
