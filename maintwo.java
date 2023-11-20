class Student {
    int id;
    String name;

    Student(){
        id = 0;
        name = "Unnamed Student";
    }

    Student(int id, String name, double grade){
        this.id = id;
        this.name = name;
    }
}

class Course {
    String code;
    String Cname;
    int maxcapacity;
    String enrolledStud[];

    
}

class School {
    String courseList[];
    String StudentList[];


}

public class maintwo{
    public static void main(String[] args){
        Student st1 = new Student();
    }
}