import java.util.Scanner;

class Nothing {
    static int id;
    String name;
    double value;

    Nothing(int id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    void setId(int id) {
        this.id = id;
    }
     void printSth(){
        System.out.println("Sth is been printed !");
    }
}

public class exceptionExample {
    String Fname;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Nothing nth = new Nothing(1, "abi", 3.14);
        System.out.println(nth.toString());
        nth.id = 2;
        nth.printSth();
        // Nothing.printSth();
        

        exceptionExample Foo = new exceptionExample();
        Foo.Fname = "foo";
        System.out.println(Foo.Fname.toString());

        try {
            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
